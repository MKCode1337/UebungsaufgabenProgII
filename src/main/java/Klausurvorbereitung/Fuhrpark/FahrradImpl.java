package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class FahrradImpl extends Fahrzeug {

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        return fahrt.min*0.125;
    }
}
