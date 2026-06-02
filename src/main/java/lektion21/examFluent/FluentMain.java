package lektion21.examFluent;

public class FluentMain {
    static void main() {
        Exam.of("abc").readQuestions().toTest("xyz");
    }
}
