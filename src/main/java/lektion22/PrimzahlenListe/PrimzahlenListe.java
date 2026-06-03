package lektion22.PrimzahlenListe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlenListe implements Runnable {
    List<Integer> primzahlen;
    Map<Integer,Boolean> primMap = new HashMap<>();

    public PrimzahlenListe(List<Integer> primzahlen) {
        this.primzahlen = primzahlen;
    }

    @Override
    public void run() {
        for (Integer i : primzahlen) {
            Boolean isPrimzahl = istPrimzahl(i);
            if (!primMap.containsKey(i)) {
                primMap.put(i, isPrimzahl);
            }
            else  {
                System.out.println(i+" ist bereits in der Liste enthalten.");
            }
        }
    }
    public Map<Integer,Boolean> getMap() {
        return primMap;
    }
    public boolean istPrimzahl(int zahl) {
        if (zahl < 2) return false;
        for (int divisor = 2; divisor < zahl; divisor++)
            if (zahl % divisor == 0) return false;
        return true;
    }
}
