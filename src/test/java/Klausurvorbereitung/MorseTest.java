package Klausurvorbereitung;

import Klausurvorbereitung.Morsen.Morse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {
    String teststring = "CAT";
    Morse morse = new Morse();

    @Test
    public void morseTest(){
        String evalString = "−.-."+" "+".-"+" "+"-"+" ";
        String testString = morse.zeichenketteToMorse(teststring);
        Assertions.assertEquals(evalString, testString);
    }
}
