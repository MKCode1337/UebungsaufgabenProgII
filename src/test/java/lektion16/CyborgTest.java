package lektion16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CyborgTest {
    Mensch menschTest = new MenschImpl();
    Roboter roboterTest = new RoboterImpl();
    Cyborg cyborgTest = new Cyborg();

    @Test
    public void testMensch() {
        double verhaeltnis = (double)entscheidungAus10K(menschTest) / 10000.0;
        Assertions.assertEquals(0.25, verhaeltnis, 0.1);
    }
    @Test
    public void testRoboter() {
        Assertions.assertEquals(Entscheidung.RECHTS, roboterTest.entscheide(Gefahr.GEFAHR_LINKS));
        Assertions.assertEquals(Entscheidung.LINKS, roboterTest.entscheide(Gefahr.GEFAHR_RECHTS));
        Assertions.assertEquals(Entscheidung.BREMSEN, roboterTest.entscheide(Gefahr.GEFAHR_VORNE));
    }
    @Test
    public void testCyborg() {
        double verhaeltnis = (double)entscheidungAus10K(cyborgTest) / 10000.0;
        System.out.println(verhaeltnis);
        Assertions.assertEquals(0.125, verhaeltnis, 0.01);
    }

    public int entscheidungAus10K(IntelligenteEntitaet fahrer){
        int counterKorrekt = 0;
        int counterUnentschieden = 0;
        for (int i=0; i<10000; i++) {
            Gefahr zufallsgefahr = zufallsGefahr();
            Entscheidung menschEnt = fahrer.entscheide(zufallsgefahr);
            if (menschEnt.equals(Entscheidung.UNENTSCHIEDEN)) {
                counterUnentschieden++;
            }
        }
        return counterUnentschieden;
    }

    public Gefahr zufallsGefahr() {
        Gefahr[] gefahren = Gefahr.values();
        Random zufallszahl = new Random();
        return gefahren[zufallszahl.nextInt(2)];
    }
}

