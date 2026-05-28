package lektion21;

import java.io.IOException;
import java.util.HashSet;

public class ExamSkizze {
    HashSet<Exam.Question> questions = new HashSet<Exam.Question>();

    private ExamSkizze(HashSet<Exam.Question> questions) {
        this.questions = questions;
    }
    private void readQuestions() throws IOException{}
    private void toTest() throws IOException {}

    public static class ExamBuilder {
        private HashSet<Exam.Question> questions;

        public ExamBuilder(){
            this.questions = new HashSet<>();
        }

        public ExamBuilderTest readQuestions(String questions){
                readQuestions(questions);
                return new ExamBuilderTest();
        }

        public class ExamBuilderTest{
            private HashSet<Exam.Question> questions;
            public ExamBuilderTest toTest(String testFile){
                toTest(testFile);
                return this;
            }
            public Exam build(){
                return new Exam();
            }
        }
    }

    static void main() throws IOException {
        Exam exam = new ExamBuilder().readQuestions("questions.csv").toTest("test.tex").build();
    }
}