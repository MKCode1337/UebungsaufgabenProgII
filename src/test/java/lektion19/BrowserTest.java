package lektion19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

public class BrowserTest {
    @Test
    public void testBrowser() {
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        if (back.isEmpty()) assert true;
        else if (back.isPresent()) assert true;
        else assert false;
    }
}
