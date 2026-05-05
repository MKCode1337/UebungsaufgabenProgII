package lektion19;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {
    @Test
    public void testBrowser() {
        RandomNr goolgle = new RandomNrTest(true);
        Browser browser = new Browser(goolgle);
        Optional<URL> back = browser.back();
        assertTrue(back.isPresent());
        assertEquals("http://google.de", browser.retrieveSite(back.get()));

//        if (back.isEmpty()) assert true;
//        else if (back.isPresent()) assert true;
//        else assert false;
    }

    @Test
    public void testEmptyUrl(){
        RandomNr goolgle = new RandomNrTest(false);
        Browser browser = new Browser(goolgle);
        Optional<URL> back = browser.back();
        assertFalse(back.isPresent());
    }
}
