package Klausurvorbereitung.Fuhrpark;

import java.util.List;

public class Umsatzberechner {
    public List<Fahrzeug> fzgliste;
    public List<Fahrt> fahrtenliste;

    public double gesamtUmsatzBerechnen(){
        return umsatzBerechnen(fzgliste);
    }

    public double berechneElektroumsatz(){
        double umsatz = 0;
        List<Fahrzeug> efzg = fzgliste.stream().filter(f -> f instanceof Elektrofahrzeug).toList();
        return umsatzBerechnen(efzg);
    }

    private double umsatzBerechnen(List<Fahrzeug> fzgliste){
        double umsatz = 0;
        for(Fahrzeug f : fzgliste){
            fahrtenliste.addAll(f.getFahrtenbuch());
        }
        for(Fahrt f: fahrtenliste){
            umsatz += f.fahrzeug.berechneEntgeld(f);
        }
        return umsatz;
    }
}
