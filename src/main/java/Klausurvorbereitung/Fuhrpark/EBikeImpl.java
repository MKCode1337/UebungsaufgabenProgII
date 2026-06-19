package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class EBikeImpl implements Fahrzeug, Elektrofahrzeug {
    @Override
    public void kehreZurückZurLadestation() {

    }

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        return 0;
    }

    @Override
    public void eintragFahrtenbuch(Fahrt fahrt) {

    }

    @Override
    public List<Fahrt> getFahrtenbuch() {
        return List.of();
    }
}
