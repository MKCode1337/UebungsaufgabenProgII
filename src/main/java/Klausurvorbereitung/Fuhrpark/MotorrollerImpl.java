package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class MotorrollerImpl implements Fahrzeug {
    public List<Fahrt> fahrtenbuch;

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        return 3+fahrt.km*0.15;
    }

    @Override
    public void eintragFahrtenbuch(Fahrt fahrt) {
        fahrtenbuch.add(fahrt);
    }

    @Override
    public List<Fahrt> getFahrtenbuch() {
        return fahrtenbuch;
    }
}
