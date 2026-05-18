package lektion20;

import lektion20.SMS.IllegalTelephoneNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static lektion20.SMS.SMS.charUmwandeln;
import static lektion20.SMS.SMS.smsUmwandeln;

public class smsTest {
        @Test
        public void testReturn(){
            Assertions.assertTrue(smsUmwandeln("Zeichenkontakte.txt", "Nummernkontakte.txt"));
        }

        @Test
        public void testSMSException(){
            try {smsUmwandeln("wrongCharTest.txt", "Nummernkontakte.txt" );}
            catch (IllegalTelephoneNumberException e) {
                Assertions.assertEquals(e.getClass(), IllegalTelephoneNumberException.class);
            }
        }
        @Test
        public void testSMSconversion(){
            Assertions.assertEquals("325858238349", charUmwandeln("FAKULTAETFIW"));
            Assertions.assertEquals("23456789", charUmwandeln("ADGJMPTW"));
            Assertions.assertEquals("234567899", charUmwandeln("BEHKNQUXZ"));
        }
}
