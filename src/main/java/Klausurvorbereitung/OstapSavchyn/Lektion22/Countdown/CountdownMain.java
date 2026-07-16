package Klausurvorbereitung.OstapSavchyn.Lektion22.Countdown;

import static java.lang.Thread.sleep;

public class CountdownMain {
    static void main() {
        Thread t1 = new CountdownErben();
        Thread t2 = new Thread(new CountdownRunnable());
        Thread t3 = new Thread() {
            public void run() {
                for (int i = 5; i >= 0; i--) {
                    try {
                        System.out.print(i);
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t4 = new Thread(()-> {
            for (int i = 5; i >= 0; i--) {
                try {
                    System.out.print(i);
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
}