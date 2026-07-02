package Klausurvorbereitung.AstronomischesObservatorium;

import java.io.Serializable;

public interface NamedMeasurementValue extends Serializable {
    public String getName();
    public double getValue();
}