package lektion22.YinYang.YinYangLocalClass;

import lektion22.YinYang.YinYangThread.YinYangThread;

public class YinYangLocalClassMain {
    static void main() {
        YinYangThread yang = new YinYangThread("Yin");
        yang.start();
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
        LocalClassThread t = new LocalClassThread("Yang");
        t.start();
    }
}
