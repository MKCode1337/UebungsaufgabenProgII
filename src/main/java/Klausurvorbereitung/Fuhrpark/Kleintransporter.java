package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class Kleintransporter extends Fahrzeug{

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        if (fahrt.min<=60){return fahrt.km*30;}
        else return 25*(fahrt.min-60)+30*fahrt.km;
    }
}
