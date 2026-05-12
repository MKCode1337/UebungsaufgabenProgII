package lektion20;

import java.util.Collections;

public class MauMauSpiel {
    public static void main(String[] args)
    {
        MauMau maumau = new MauMau();
        MauMauSpieler spieler1 = new MauMauSpieler("Spieler1");
        spieler1.hand = new MauMauHand();

        for (int i = 0; i <= 7;i++){
            MauMauKarte k = maumau.karteZiehen();
            spieler1.hand.add(k);
        }
        for (MauMauKarte k : spieler1.getHand()){
            System.out.println(k.farbe + " " + k.wert);
        }
        System.out.println("\n");
        Collections.sort(spieler1.hand);
        System.out.println("Sortierte Ausgabe: "+"\n");
        for (MauMauKarte k : spieler1.getHand()){
            System.out.println(k.farbe + " " + k.wert);
        }
    }
}
