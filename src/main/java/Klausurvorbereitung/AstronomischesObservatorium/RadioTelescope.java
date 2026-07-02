package Klausurvorbereitung.AstronomischesObservatorium;

public class RadioTelescope extends ObservationInstrument{
    double antennaDiameter;

    public RadioTelescope(String name, int year, double antennaDiameter) {
        super(name, year);
        this.antennaDiameter = antennaDiameter;
    }

    public double observationPerformance(){return antennaDiameter*5;}
}
