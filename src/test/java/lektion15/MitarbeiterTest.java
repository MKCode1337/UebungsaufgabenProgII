package lektion15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class MitarbeiterTest {
    Angestellter testAngestellter = new Angestellter("Muster", "Max", 1, 1000, LocalDate.of(1990, 5, 23) );
    Abteilungsleiter testAbteilungsleiter = new Abteilungsleiter("Bravo", "Berta", 2, 1000, LocalDate.of(1990, 5, 23) );

    @Test
    public void testAngestellter() {
        testMitarbeiter(testAngestellter, "Muster", "Max", 1, 1000,1.0, 1000, LocalDate.of(1990, 5, 23));
    }

    @Test
    public void testAbteilungsleiter() {
        testMitarbeiter(testAbteilungsleiter,"Bravo", "Berta", 2, 1000, 2.0, 2000, LocalDate.of(1990, 5, 23));
        assertEquals(2000, testAbteilungsleiter.getGehalt());
        testAbteilungsleiter.befoerdern(testAngestellter);
        assertEquals(1100, testAngestellter.getGehalt(), 0.001);
        testAbteilungsleiter.befoerdern(testAngestellter);
        assertEquals(1200, testAngestellter.getGehalt(), 0.001);
    }

    public void testMitarbeiter(Angestellter mitarbeiter, String nachname, String vorname, int ID, int grundgehalt,double gehaltsfaktor, double gehalt, LocalDate geburtsdatum) {
        assertEquals(nachname, mitarbeiter.nachname);
        assertEquals(vorname, mitarbeiter.vorname);
        assertEquals(ID, mitarbeiter.ID);
        assertEquals(grundgehalt, mitarbeiter.grundgehalt);
        assertEquals(gehaltsfaktor, mitarbeiter.gehaltsFaktor);
        assertEquals(gehalt, mitarbeiter.getGehalt());
        assertEquals(geburtsdatum,  mitarbeiter.geburtsdatum);
    }

}
