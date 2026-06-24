package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class FahrradImpl extends Fahrzeug {
    public List<Fahrt> fahrtenbuch;

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        return fahrt.min*12.5;
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
