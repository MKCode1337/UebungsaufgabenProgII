import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StreckeTest {

    @Test
    public void korrekteStreckeAnlegen(){
        Strecke korreckteStrecke = new Strecke(1,3);
        Strecke korrekteStreckeEinPunkt = new Strecke(2,2);
        assertEquals("1--3", korreckteStrecke.toString());
        assertEquals("2", korrekteStreckeEinPunkt.toString());
    }
}