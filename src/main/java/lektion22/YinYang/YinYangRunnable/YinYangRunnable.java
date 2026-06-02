package lektion22.YinYang.YinYangRunnable;

import static java.lang.Thread.sleep;

public class YinYangRunnable implements Runnable{
    String ausgabe;
    public YinYangRunnable(String ausgabe) {
        this.ausgabe = ausgabe;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this.ausgabe);
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
