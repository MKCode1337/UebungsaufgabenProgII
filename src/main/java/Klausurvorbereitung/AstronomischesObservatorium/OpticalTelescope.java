package Klausurvorbereitung.AstronomischesObservatorium;

public class OpticalTelescope extends ObservationInstrument{
    double aperture;

    public OpticalTelescope(String name, int year, double aperture){
        super(name, year);
        this.aperture = aperture;
    }

    public double observationPerformance(){return  aperture*10;}
}
