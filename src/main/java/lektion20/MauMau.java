package lektion20;

import java.util.*;

public class MauMau implements Kartenspiel {
    String[] farbe = new String[]{"Herz", "Pik", "Karo", "Kreuz"};
    String[] wert = new  String[]{"7","8","9","10","Ass","Bube","Dame","König"};
    ArrayList<MauMauKarte> deck = new ArrayList<>();

    public MauMau (){
        for (String f : this.farbe){
            for (String w : this.wert){
                MauMauKarte karte = new MauMauKarte(f, w);
                deck.add(karte);
            }
        }
    }

    @Override
    public Spielkarte karteZiehen() {
        Random random = new Random();
        int zufallszahl = random.nextInt(deck.size());
        MauMauKarte karte = deck.remove(zufallszahl);
        return karte;
    }

    @Override
    public ArrayList<MauMauKarte> getDeck() {
        return deck;
    }
}
