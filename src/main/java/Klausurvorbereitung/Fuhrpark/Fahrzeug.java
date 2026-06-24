package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public abstract class Fahrzeug {
    public abstract double berechneEntgeld(Fahrt fahrt);
    public abstract void eintragFahrtenbuch(Fahrt fahrt);
    public abstract List<Fahrt> getFahrtenbuch();
}
