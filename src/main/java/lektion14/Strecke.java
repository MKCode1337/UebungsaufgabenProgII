package lektion14;

public class Strecke {
    private int punktA;
    private int punktB;

    public Strecke(int A, int B){
        if (A < 1 || B < 1) throw new RuntimeException("Werte müssen ganzzahlig positiv sein!");
        this.punktA = Math.min(A, B);
        this.punktB = Math.max(A, B);
    }
    // Wenn größter Startpunkt < kleinster Endpunkt dann gibt es Überschneidung!
    public static boolean pruefeUeberschneidung(Strecke strecke1, Strecke strecke2){
        if (Math.max(strecke1.getPunktA(), strecke2.getPunktA()) < Math.min(strecke1.getPunktB(), strecke2.getPunktB())){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        String ausgabe = String.valueOf(this.getPunktA());
        int abstand = this.getPunktB()-this.getPunktA();
        if (abstand == 0) return ausgabe;
        else {
            for (int i = 0; i < abstand; i++) ausgabe += "-";
            ausgabe += String.valueOf(this.getPunktB());
        }
        return ausgabe;
    }

    public int getPunktA() {
        return punktA;
    }

    public void setPunktA(int punktA) {
        this.punktA = punktA;
    }

    public int getPunktB() {
        return punktB;
    }

    public void setPunktB(int punktB) {
        this.punktB = punktB;
    }
}
