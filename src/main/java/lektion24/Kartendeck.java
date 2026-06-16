package lektion24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kartendeck {
    List<Karte> karten;

    public void erzeugeDeck() {
        this.karten = Stream.of(Wert.values())
                .flatMap(wert ->
                        Stream.of(Farbe.values())
                                .map(farbe -> new Karte(farbe, wert))
                )
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return karten.stream().map(Karte::toString).collect(Collectors.joining(", "));
    }

    public enum Farbe
    {
        KREUZ, PIK, HERZ, KARO
    }
    public enum Wert
    {
        BUBE, ASS, ZEHN, KOENIG, DAME, NEUN, ACHT,
        SIEBEN
    }
    public class Karte
    {
        Farbe farbe;
        Wert wert;
        public Karte(Farbe farbe, Wert wert)
        {
            this.farbe = farbe;
            this.wert = wert;
        }

        @Override
        public String toString()
        {
            return farbe + " " + wert;
        }
    }

    static void main() {
        Kartendeck deck = new Kartendeck();
        deck.erzeugeDeck();
        System.out.println(deck);
    }
}
