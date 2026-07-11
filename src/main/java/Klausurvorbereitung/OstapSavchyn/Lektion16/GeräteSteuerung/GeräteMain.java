package Klausurvorbereitung.OstapSavchyn.Lektion16.GeräteSteuerung;

import java.util.ArrayList;
import java.util.List;

public class GeräteMain {
    static void main(){
        List<Bedienbar> geraete = new ArrayList<>();
        geraete.add(new Lampe());
        geraete.add(new Computer());
        objecteEinAus(geraete);
    }

    public static <T extends Bedienbar> void objecteEinAus(List<T> geraete){
        for(T t: geraete){
            t.einschalten();
            t.ausschalten();
        }
    };
}
