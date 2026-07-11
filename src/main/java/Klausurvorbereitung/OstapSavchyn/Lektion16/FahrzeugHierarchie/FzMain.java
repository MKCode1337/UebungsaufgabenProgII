package Klausurvorbereitung.OstapSavchyn.Lektion16.FahrzeugHierarchie;

public class FzMain {

    static void main() {
        Fahrzeug[] kfz = {new Fahrrad(), new Auto(), new Fahrrad(), new Auto()};
        for (Fahrzeug f:kfz){
            f.beschleunige(10);
            f.beschleunige(100);
            f.beschleunige(1000);
        }
    }
}
