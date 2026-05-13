package lektion20;

import java.util.ArrayList;

public class MauMauKarte extends Spielkarte implements Comparable<MauMauKarte>{
    String[] farben = new String[]{"Kreuz", "Pik", "Herz", "Karo"};
    String[] werte = new  String[]{"Bube","Ass","10","König","Dame","9","8","7"};
    String farbe;
    String wert;


    public MauMauKarte(String farbe, String wert){
        this.farbe = farbe;
        this.wert = wert;
    }public MauMauKarte(){
    }

    public ArrayList<MauMauKarte> skatDeckGenerieren(){
        ArrayList<MauMauKarte> deck = new ArrayList<>(32);
        deck.add(new MauMauKarte("Kreuz","Bube"));
        deck.add(new MauMauKarte("Pik","Bube"));
        deck.add(new MauMauKarte("Herz","Bube"));
        deck.add(new MauMauKarte("Karo","Bube"));
        for (String f : this.farben){
            for (String w : this.werte){
                if(w.equals("Bube")){continue;}
                MauMauKarte karte = new MauMauKarte(f, w);
                deck.add(karte);
            }
        }
        return deck;
    }

    @Override
    public int compareTo(MauMauKarte o) {
        ArrayList<MauMauKarte> skatDeck = skatDeckGenerieren();
        int indexThis = skatDeck.indexOf(this);
        int indexO = skatDeck.indexOf(o);
        for (MauMauKarte k: skatDeck){
            if (k.farbe.equals(this.farbe)&& k.wert.equals(this.wert)){indexThis = skatDeck.indexOf(k);}
            if (k.farbe.equals(o.farbe)&& k.wert.equals(o.wert)){indexO = skatDeck.indexOf(k);}
        }
        if (indexThis > indexO) return 1;
        if (indexThis < indexO) return -1;
        else return 0;
    }
}
