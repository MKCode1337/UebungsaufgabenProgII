package lektion20;

import java.util.*;

public class MauMauHand extends ArrayList<MauMauKarte> {

    public MauMauHand(MauMau deck){
        for (int i = 0; i<=7;i++){
            this.add((MauMauKarte) deck.karteZiehen());
        }
    }
    public MauMauHand getHand() { return this;
    }
}
