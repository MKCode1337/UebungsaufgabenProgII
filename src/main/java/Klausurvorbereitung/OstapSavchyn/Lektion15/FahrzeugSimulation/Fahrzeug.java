package Klausurvorbereitung.OstapSavchyn.Lektion15.FahrzeugSimulation;

import java.util.List;

public abstract class Fahrzeug {
    public abstract void fahre();
    public abstract double tankstand();
    public static void fahrzeugTesten(List<Fahrzeug> fs){
        for(Fahrzeug f: fs){
            f.fahre();
            f.tankstand();
        }
    }
}
