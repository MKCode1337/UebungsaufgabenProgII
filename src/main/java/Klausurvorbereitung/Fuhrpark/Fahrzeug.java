package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public abstract class Fahrzeug implements IFahrzeug {
    public List<Fahrt> fahrtenbuch;
    public abstract double berechneEntgeld(Fahrt fahrt);
    public void eintragFahrtenbuch(Fahrt fahrt) {
        fahrtenbuch.add(fahrt);
    }
    public List<Fahrt> getFahrtenbuch() {
        return fahrtenbuch;
    }
}