package Klausurvorbereitung.OstapSavchyn.Lektion22.Zahlensumme;

import java.util.List;

public class ZahlenSummeMain {
    static void main() {
        List<Double> zahlenliste = List.of(11.0,12.0,13.5);
        Thread t1 = new Thread(new Zahlensumme(zahlenliste));
        Thread t2 = new Thread(new Zahlensumme(zahlenliste));
        t1.start();t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
