package Klausurvorbereitung.AstronomischesObservatorium;

public class Measurement implements NamedMeasurementValue {
    String name;
    double value;

    public Measurement(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}