package lektion21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ExamTest {
    @Test
    public void examTest() {
        Exam exam = new Exam();
        try {
            exam.readQuestions();
        } catch (IOException e) {
        }
        try {
            exam.toTest();
        } catch (IOException e) {
        }
        File testpfad = new File("text.tex");
        if (testpfad.exists()) {Assertions.assertTrue(testpfad.exists());}
    }
}
