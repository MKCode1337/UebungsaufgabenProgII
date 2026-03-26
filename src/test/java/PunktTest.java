import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunktTest {
    Punkt testPunkt =  new Punkt();

    @Test
    public void verschiebePunktTestKorrekteWerte(){
        testPunkt.verschiebePunkt(600,400);
        assertEquals(600, testPunkt.x);
        assertEquals(400, testPunkt.y);
    }

    @Test
    public void verschiebePunktTestNegativeWerte(){
//        try{
//            testPunkt.verschiebePunkt(-600,400);
//            fail("Runtime Exception erwartet");
//        }
//        catch(RuntimeException e){
//            String errorMessage = e.getMessage();
//            assertEquals("Werte duerfen nicht negativ sein.", errorMessage);
//        }
//        try{
//            testPunkt.verschiebePunkt(600,-400);
//            fail("Runtime Exception erwartet");
//        }
//        catch(RuntimeException e){
//            String errorMessage = e.getMessage();
//            assertEquals("Werte duerfen nicht negativ sein.", errorMessage);
//        }
        exceptionHelper(-600, 400, "Werte duerfen nicht negativ sein.");
        exceptionHelper(600, -400, "Werte duerfen nicht negativ sein.");
    }

    @Test
    public void verschiebePunktTestOutOfRange(){
//        try{
//            testPunkt.verschiebePunkt(1921,400);
//            fail("Runtime Exception erwartet");
//        }
//        catch(RuntimeException e){
//            String errorMessage = e.getMessage();
//            assertEquals("X darf nicht groeßer als 1920 sein.", errorMessage);
//        }
//        try{
//            testPunkt.verschiebePunkt(600,1081);
//            fail("Runtime Exception erwartet");
//        }
//        catch(RuntimeException e){
//            String errorMessage = e.getMessage();
//            assertEquals("Y darf nicht groeßer als 1080 sein.", errorMessage);
//        }

        exceptionHelper(1921, 400, "X darf nicht groeßer als 1920 sein.");
        exceptionHelper(600, 1081, "Y darf nicht groeßer als 1080 sein.");
    }

    public void exceptionHelper(int x, int y, String message){
        try{
            testPunkt.verschiebePunkt(x,y);
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(message, errorMessage);
        }
    }
}
