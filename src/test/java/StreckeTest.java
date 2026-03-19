import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StreckeTest {

    @Test
    public void testeToString(){
        Strecke strecke1 = new Strecke(1,3);
        Strecke streckeEinPunkt = new Strecke(2,2);
        assertEquals("1--3", strecke1.toString());
        assertEquals("2", streckeEinPunkt.toString());
    }

    @Test
    public void testeUeberschneidung(){
        Strecke strecke1bis3 = new Strecke(1, 3);
        Strecke strecke2bis5 = new Strecke(2, 5);
        Strecke strecke5bis7 = new Strecke(5,7);

        assertTrue(Strecke.pruefeUeberschneidung(strecke1bis3, strecke2bis5));
        assertFalse(Strecke.pruefeUeberschneidung(strecke1bis3, strecke5bis7));
        assertFalse(Strecke.pruefeUeberschneidung(strecke2bis5, strecke5bis7));
    }
}