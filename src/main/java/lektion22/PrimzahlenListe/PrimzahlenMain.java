package lektion22.PrimzahlenListe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrimzahlenMain {
    static void main() {
        ArrayList<Integer> primListe1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> primListe2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> primListe3 = new ArrayList<>(Arrays.asList(10, 11, 20, 22, 30, 33, 40, 44, 1254, 1111, 654748));

        PrimzahlenListe pm1 = new PrimzahlenListe(primListe1);
        PrimzahlenListe pm2 = new PrimzahlenListe(primListe2);
        PrimzahlenListe pm3 = new PrimzahlenListe(primListe3);

        Thread t1 = new Thread(pm1);
        Thread t2 = new Thread(pm2);
        Thread t3 = new Thread(pm3);
        t1.start();
        t2.start();
        t3.start();

        Map primMap = new HashMap();
        try {
            t1.join();
            t2.join();
            t3.join();

            primMap = pm1.getMap();
            primMap.putAll(pm2.getMap());
            primMap.putAll(pm3.getMap());
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Object obj : primMap.keySet()){
            System.out.println(obj + " -> " + primMap.get(obj));
        }
    }
}
