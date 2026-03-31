package test15;

import lektion15.Abteilungsleiter;
import lektion15.Angestellter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class MitarbeiterTest {
    Angestellter testAngestellter = new Angestellter("Muster", "Max", 1, 1000, LocalDate.of(1990, 5, 23) );
    Abteilungsleiter testAbteilungsleiter = new Abteilungsleiter("Bravo", "Berta", 2, 1000, LocalDate.of(1990, 5, 23) );
    @Test
    public void testMitarbeiter() {
        assertEquals("Muster", testAngestellter.nachname);
        assertEquals("Max", testAngestellter.vorname);
        assertEquals(1, testAngestellter.ID);
        assertEquals(1000, testAngestellter.grundgehalt);
        assertEquals(1.0, testAngestellter.gehaltsFaktor);
        assertEquals(1000, testAngestellter.getGehalt());
        assertEquals(LocalDate.of(1990, 5, 23),  testAngestellter.geburtsdatum);
    }

    @Test
    public void testAbteilungsleiter() {
        assertEquals(2000, testAbteilungsleiter.getGehalt());
        testAbteilungsleiter.befoerdern(testAngestellter);
        assertEquals(1100, testAngestellter.getGehalt(), 0.0001);
        testAbteilungsleiter.befoerdern(testAngestellter);
        assertEquals(1200, testAngestellter.getGehalt(), 0.0001);
    }
}
