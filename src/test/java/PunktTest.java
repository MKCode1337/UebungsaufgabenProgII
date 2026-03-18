import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunktTest {
    Punkt testPunkt =  new Punkt();

    @Test
    public void verschiebePunktTestKorrekteWerte(){
        try{
        testPunkt.verschiebePunkt(600,400);
        }
        catch(Exception e){
            fail("Unerwarteter Fehler.");
        }
    }

    @Test
    public void verschiebePunktTestNegativeWerte(){
        try{
            testPunkt.verschiebePunkt(-600,400);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Werte duerfen nicht negativ sein.", errorMessage);
        }
        try{
            testPunkt.verschiebePunkt(600,-400);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Werte duerfen nicht negativ sein.", errorMessage);
        }
    }

    @Test
    public void verschiebePunktTestOutOfRange(){
        try{
            testPunkt.verschiebePunkt(1921,400);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("X darf nicht groeßer als 1920 sein.", errorMessage);
        }
        try{
            testPunkt.verschiebePunkt(600,1081);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Y darf nicht groeßer als 1920 sein.", errorMessage);
        }
    }
}
