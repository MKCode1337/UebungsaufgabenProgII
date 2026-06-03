package lektion22.YinYang.YinYangThread;

import static java.lang.Thread.sleep;

public class YinYangThreadMain {
    static void main() {
        YinYangThread yin = new YinYangThread("Yin");
        yin.start();

        while (true) {
            try {
                System.out.println("Yang");
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
