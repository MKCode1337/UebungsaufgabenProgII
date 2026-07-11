package Klausurvorbereitung.OstapSavchyn.Lektion15.FahrzeugSimulation;

public class Elektroauto extends Fahrzeug{
    double tankstand;
    public Elektroauto(){
        this.tankstand = 80.0;
    }

    @Override
    public void fahre() {}

    @Override
    public double tankstand() {
        return this.tankstand;
    }
}