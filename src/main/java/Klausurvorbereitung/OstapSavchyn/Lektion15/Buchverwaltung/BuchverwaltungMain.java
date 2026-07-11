package Klausurvorbereitung.OstapSavchyn.Lektion15.Buchverwaltung;

public class BuchverwaltungMain {

    static void main(){
        Buch[] buecher = {new Lehrbuch("Tom","Tolle Sterne","Quantenphysik"),
                new Roman("Katie","Liebesdingsbums","Romanze")};
        for(Buch b: buecher){
            b.zeigeInfo();
        }
    }
}
