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

    public class ExamBuilder {
        private HashSet<Exam.Question> questions;
        String questionsFile;
        String testFile;
        public ExamBuilder(String questionsFile, String testFile){
            this.questions = new HashSet<>();
            this.questionsFile = questionsFile;
            this.testFile = testFile;
        }
        public Exam build() throws IOException {
            Exam exam = new Exam();
            exam.readQuestions();
            exam.toTest();
            return exam;
        }
    }
}
