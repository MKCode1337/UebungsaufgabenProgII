package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public interface IFahrzeug {
    public List<Fahrt> getFahrtenbuch();
    public double berechneEntgeld(Fahrt fahrt);
}
