package lektion20;

import java.util.ArrayList;

public interface Kartenspiel {
        public ArrayList<MauMauKarte> getDeck();
        public Spielkarte karteZiehen();
}
