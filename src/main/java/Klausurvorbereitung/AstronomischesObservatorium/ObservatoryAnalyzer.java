package Klausurvorbereitung.AstronomischesObservatorium;

import java.util.List;

public class ObservatoryAnalyzer {
    public static double maxSpecialCalibration(List<SpecialCalibration> instruments){
        return instruments.stream().map(i -> i.calibrationValue()).max((i1,i2)->Double.compare(i1,i2)).orElse(0.0);
    };
}
