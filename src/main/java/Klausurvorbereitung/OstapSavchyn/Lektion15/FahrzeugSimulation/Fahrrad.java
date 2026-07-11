package Klausurvorbereitung.OstapSavchyn.Lektion15.FahrzeugSimulation;

public class Fahrrad extends Fahrzeug{
    double tankstand;
    public Fahrrad(){
        this.tankstand = 0.0;
    }

    @Override
    public void fahre() {}

    @Override
    public double tankstand() {
        return this.tankstand;
    }
}