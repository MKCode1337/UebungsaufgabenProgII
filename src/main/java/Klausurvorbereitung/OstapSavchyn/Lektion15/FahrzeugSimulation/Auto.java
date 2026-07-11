package Klausurvorbereitung.OstapSavchyn.Lektion15.FahrzeugSimulation;

public class Auto extends Fahrzeug{
    double tankstand;
    public Auto(){
        this.tankstand = 60.0;
    }

    @Override
    public void fahre() {}

    @Override
    public double tankstand() {
        return this.tankstand;
    }
}