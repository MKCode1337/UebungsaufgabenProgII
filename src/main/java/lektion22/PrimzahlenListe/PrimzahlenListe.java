package lektion22.PrimzahlenListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlenListe implements Runnable {
    ArrayList<Integer> primzahlen;
    Map<Integer,Boolean> primMap = new HashMap<>();

    public PrimzahlenListe(List<Integer> primzahlen) {
        this.primzahlen = (ArrayList<Integer>) primzahlen;
    }

    @Override
    public void run() {
        for (Integer i : primzahlen) {
            Boolean isPrimzahl = istPrimzahl(i);
            if (!primMap.containsKey(i)) {
                if (isPrimzahl) {
                    primMap.put(i, true);
                } else {
                    primMap.put(i, false);
                }
            }
            else  {
                System.out.println("Zahl bereits in der Liste enthalten.");
            }
        }
    }
    public Map getMap() {
        return primMap;
    }
    public boolean istPrimzahl(int zahl) {
        if (zahl < 2) return false;
        for (int divisor = 2; divisor < zahl; divisor++)
            if (zahl % divisor == 0) return false;
        return true;
    }
}
