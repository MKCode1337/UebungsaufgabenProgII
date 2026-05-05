package lektion19;

class RandomNrTest implements RandomNr {
    boolean google;

    public RandomNrTest(boolean google) {
        this.google = google;
    }

    public double getRandomNr(){
        return this.google ? 0.2: 0.8;
    }
}
