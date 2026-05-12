package lektion20;

import java.util.*;

public class MauMau implements Kartenspiel {
    MauMauKarte karten = new MauMauKarte();
    ArrayList<MauMauKarte> deck = karten.skatDeckGenerieren();

    @Override
    public MauMauKarte karteZiehen() {
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
