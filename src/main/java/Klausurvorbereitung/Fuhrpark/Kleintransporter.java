package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class Kleintransporter extends Fahrzeug{
    public List<Fahrt> fahrtenbuch;

    @Override
    public double berechneEntgeld(Fahrt fahrt) {
        if (fahrt.min<=60){return fahrt.km*30;}
        else return 25*(fahrt.min-60)+30* fahrt.km;
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
