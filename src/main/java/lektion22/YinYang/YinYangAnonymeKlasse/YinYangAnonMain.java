package lektion22.YinYang.YinYangAnonymeKlasse;

import lektion22.YinYang.YinYangThread.YinYangThread;

public class YinYangAnonMain {
    static void main() {
        Thread t1 = anonThread("Yin");
        t1.start();
        Thread t2 = anonThread("Yang");
        t2.start();
    } //Ende Main

    public static Thread anonThread(String ausgabe){
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(ausgabe);
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };//Ende anonyme Klasse
        return t;
    }
}
