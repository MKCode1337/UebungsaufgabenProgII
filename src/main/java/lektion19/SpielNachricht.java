package lektion19;

import java.io.Serial;
import java.io.Serializable;

public class SpielNachricht implements Serializable {
    String text;
    Boolean spielBeendet;
    Boolean treffer;
    public SpielNachricht(String text) {
        this.text = text;
        this.spielBeendet = false;
        this.treffer = false;
    }
}

