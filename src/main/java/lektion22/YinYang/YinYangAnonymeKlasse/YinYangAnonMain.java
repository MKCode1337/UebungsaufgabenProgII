package lektion22.YinYang.YinYangAnonymeKlasse;

import lektion22.YinYang.YinYangThread.YinYangThread;

public class YinYangAnonMain {
    static void main() {
        YinYangThread yang = new YinYangThread("Yang");
        yang.start();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Yin");
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }; //Ende anonyme Klasse
        t1.start();
    } //Ende Main
}
