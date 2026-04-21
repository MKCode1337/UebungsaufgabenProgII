package lektion17;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class WertebereichTest {

    //off + len muss <= 5 sein, off darf nicht < 0 sein
    @Test
    public void testWertebereichOff() {
        //Korrekter Ablauf
        try {
            writeTestCopy(0, 5);
        }
        catch(Exception e){
            fail("Keine Exception erwartet");
        }
        //Off+Len > 5
        try {
            writeTestCopy(1, 5);
            fail("Exception erwartet");
        }
        catch (Exception e) {
        }
        //Off < 0
        try {
            writeTestCopy(-1, 5);
            fail("Exception erwartet");
        }
        catch (Exception e) {
        }
    }

    //len darf nicht länger sein als 5, len darf nicht < 0 sein
    @Test
    public void testWertebereichLen() {
        //Len größer als Länge von b
        try {
            writeTestCopy(0, 6);
            fail("Exception erwartet");
        }
        catch (Exception e) {
        }
        //Len < 0
        try {
            writeTestCopy(0, -1);
            fail("Exception erwartet");
        }
        catch (Exception e) {
        }
    }

    public static void writeTestCopy(int off, int len)  throws IOException
    {
        try(InputStream fis = new FileInputStream("test.txt");
            OutputStream fos = new FileOutputStream("testcopy.txt");)
        {
            byte[] b = new byte[5];
            int n;
            do
            {
                n = fis.read(b); //kann maximal 5 bytes lesen
                try {
                    if (n != -1) fos.write(b, off, len);
                }
                catch (IOException e) {
                }
            }
            while (n != -1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
