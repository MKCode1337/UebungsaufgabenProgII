package test14;
import lektion14.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonAdresseTest {

    @Test
    public void testAdresseKorrekt() {
        try{
            Adresse korrekteAdresse = new Adresse("Teststrasse","3","97080", "Würzburg");
        }
        catch(RuntimeException e){
        }
    }
    @Test
    public void testAdresseFehlerStrasse() {
//        try {
//            lektion14.Adresse fehlerAdresse = new lektion14.Adresse("teststrasse", "3", "97080", "Würzburg");
//            fail("Runtime Exception erwartet");
//        } catch (RuntimeException e) {
//            String errorMessage = e.getMessage();
//            assertEquals("Strassenname muss mit einem Großbuchstaben beginnen.", errorMessage);
//        }
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            Adresse fehlerAdresse = new Adresse("teststrasse", "3", "97080", "Würzburg");
        });
        String errorMessage = e.getMessage();
        assertEquals("Strassenname muss mit einem Großbuchstaben beginnen.", errorMessage);
    }

    @Test
    public void testAdresseFehlerOrt() {
        try{
            Adresse fehlerAdresse = new Adresse("Teststrasse","3","97080", "würzburg");
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Ortsname muss mit einem Großbuchstaben beginnen.", errorMessage);
        }
    }
    @Test
    public void testAdresseFehlerHsnr() {
        try{
            Adresse fehlerAdresse = new Adresse("Teststrasse","drei","97080", "Würzburg");
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Hausnummer muss mit einer Ziffer beginnen.", errorMessage);
        }
    }
    @Test
    public void testPersonKorrekt() {
        try{
            Adresse korrekteAdresse = new Adresse("Teststrasse","3","97080", "Würzburg");
            Person korrektePerson = new Person("Peter", "Maffei", korrekteAdresse);
        }
        catch(RuntimeException e){
        }
    }
    @Test
    public void testPersonFehler() {
        try{
            Adresse korrekteAdresse = new Adresse("Teststrasse","3","97080", "Würzburg");
            Person fehlerPerson = new Person("peter", "Maffei", korrekteAdresse);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Vorname muss mit einem Großbuchstaben beginnen", errorMessage);
        }
    }


}
