package Klausurvorbereitung.AstronomischesObservatorium;

public class AdaptiveOpticsTelescope extends OpticalTelescope implements SpecialCalibration{
    int  adaptiveMirrors;

    public AdaptiveOpticsTelescope(String name, int year, double aperture, int  adaptiveMirrors) {
        super(name, year, aperture);
        this.adaptiveMirrors = adaptiveMirrors;
    }

    @Override
    public double calibrationValue() {
        return adaptiveMirrors*1.5;
    }

    @Override
    public double observationPerformance() {
        return super.observationPerformance()+2*adaptiveMirrors;
    }
}