package Klausurvorbereitung.OstapSavchyn.Lektion16.Superkräfte;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuperheldenMain {
    static void main(){
        List<Superheld> helden = new ArrayList<>();
        helden.add(new Superheld());
        helden.add(new Superheld());
        helden.add(new Superheld());
        helden.add(new Superheld());
        Random random = new Random();

        for(Superheld s:helden){
            int zufallszahl = random.nextInt(3);
            if (zufallszahl == 0) s.fliege();
            if (zufallszahl == 1) s.versteckeDich();
            if (zufallszahl == 2) s.hebeGewicht(500);
        }
    }
}
