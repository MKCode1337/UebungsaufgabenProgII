package lektion20;

public class MauMauSpiel {
    public static void main(String[] args)
    {
        MauMau maumau = new MauMau();
        MauMauSpieler spieler1 = new MauMauSpieler("Spieler1");
        spieler1.hand = new MauMauHand(maumau);
        for (MauMauKarte k : spieler1.getHand()){
            System.out.println(k.farbe + " " + k.wert);
        }
    }
}
