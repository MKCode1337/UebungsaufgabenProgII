package Klausurvorbereitung;

import java.util.function.Consumer;

public class WCWMain {
    static void main() {
        Consumer<String> consoleWriter = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        WebsiteChangeWatcher wcw = new WebsiteChangeWatcher("https://www.zeit.de", "campus", consoleWriter);
        wcw.hasChanged();
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wcw.cancel();
    }

}