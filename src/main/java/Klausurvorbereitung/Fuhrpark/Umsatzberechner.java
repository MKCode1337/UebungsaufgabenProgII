package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class Umsatzberechner {
    public double berechneElektroumsatz(List<Elektrofahrzeug> efzgliste){
        return gesamtUmsatzBerechnen(efzgliste);
    }

    public double gesamtUmsatzBerechnen(List<? extends IFahrzeug> fzgliste){
        double umsatz = 0;
        for(IFahrzeug fzg : fzgliste) {
            for (Fahrt fa : fzg.getFahrtenbuch()) {
                umsatz += fzg.berechneEntgeld(fa);
            }
        }
        return umsatz;
    }
}