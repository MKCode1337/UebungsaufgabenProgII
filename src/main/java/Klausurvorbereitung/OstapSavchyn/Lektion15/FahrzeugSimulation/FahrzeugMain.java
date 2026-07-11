package Klausurvorbereitung.OstapSavchyn.Lektion15.FahrzeugSimulation;

import java.util.ArrayList;
import java.util.List;

public class FahrzeugMain {
    static void main(){
        List<Fahrzeug> fs = new ArrayList<>();
        fs.add(new Auto());
        fs.add(new Fahrrad());
        fs.add(new Elektroauto());

        Fahrzeug.fahrzeugTesten(fs);

    }
}
