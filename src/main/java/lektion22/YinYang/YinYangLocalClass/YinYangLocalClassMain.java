package lektion22.YinYang.YinYangLocalClass;

import lektion22.YinYang.YinYangThread.YinYangThread;

public class YinYangLocalClassMain {
    static void main() {
        class LocalClassThread extends Thread {
            String ausgabe;
            public LocalClassThread(String ausgabe) {
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
        }//Ende LocalClassThread
        LocalClassThread t1 = new LocalClassThread("Yang");
        LocalClassThread t2 = new LocalClassThread("Yin");
        t1.start();
        t2.start();
    }
}
