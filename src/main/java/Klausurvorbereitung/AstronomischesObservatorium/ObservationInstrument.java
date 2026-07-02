package Klausurvorbereitung.AstronomischesObservatorium;

public abstract class ObservationInstrument {
    String name;
    int year;
    int operatingState ;

    public ObservationInstrument(String name, int year) {
        this.name = name;
        this.year = year;
        this.operatingState = 100;
    }

    public void calibrate(int value) throws IllegalArgumentException{
        if (value < 0) throw new IllegalArgumentException();
        this.operatingState = this.operatingState + value;
        if (this.operatingState>100) this.operatingState = 100;
        if (this.operatingState<0) this.operatingState = 0;
    }
    public int getOperatingState(){return operatingState;}

    public abstract double observationPerformance();
}