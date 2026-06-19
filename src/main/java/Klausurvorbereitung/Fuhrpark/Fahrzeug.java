package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public interface Fahrzeug {
    public double berechneEntgeld(Fahrt fahrt);
    public void eintragFahrtenbuch(Fahrt fahrt);
    public List<Fahrt> getFahrtenbuch();
}
