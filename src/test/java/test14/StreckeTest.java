package test14;
import lektion14.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreckeTest {

    @Test
    public void testeToString(){
        Strecke strecke1 = new Strecke(1,3);
        Strecke streckeEinPunkt = new Strecke(2,2);
        Assertions.assertEquals("1--3", strecke1.toString());
        Assertions.assertEquals("2", streckeEinPunkt.toString());
    }

    @Test
    public void testeUeberschneidung(){
        Strecke strecke1bis3 = new Strecke(1, 3);
        Strecke strecke2bis5 = new Strecke(2, 5);
        Strecke strecke5bis7 = new Strecke(5,7);

        Assertions.assertTrue(Strecke.pruefeUeberschneidung(strecke1bis3, strecke2bis5));
        Assertions.assertFalse(Strecke.pruefeUeberschneidung(strecke1bis3, strecke5bis7));
        Assertions.assertFalse(Strecke.pruefeUeberschneidung(strecke2bis5, strecke5bis7));
    }
}