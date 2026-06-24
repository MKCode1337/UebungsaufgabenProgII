package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class MotorrollerImpl extends Fahrzeug {

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        return 3+fahrt.km*0.15;
    }
}
