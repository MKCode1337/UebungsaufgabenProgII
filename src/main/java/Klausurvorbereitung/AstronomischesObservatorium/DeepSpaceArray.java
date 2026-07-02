package Klausurvorbereitung.AstronomischesObservatorium;

public class DeepSpaceArray extends RadioTelescope implements SpecialCalibration{
    int linkedAntennas;
    public DeepSpaceArray(String name, int year, double antennaDiameter, int linkedAntennas) {
        super(name, year, antennaDiameter);
        this.linkedAntennas = linkedAntennas;
    }

    @Override
    public double calibrationValue() {
        return 2*linkedAntennas;
    }

    @Override
    public double observationPerformance() {
        return super.observationPerformance()+3*linkedAntennas;
    }
}