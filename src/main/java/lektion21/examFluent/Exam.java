package lektion21.examFluent;

public class Exam implements ToFile, ReadFile{
    private Exam(){}

    public static ReadFile of(String filename){
        return new Exam();
    }

    @Override
    public ToFile readQuestions() {
        return this;
    }

    @Override
    public void toTest(String testFile) {
    }
}
