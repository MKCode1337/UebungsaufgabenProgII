package lektion21;

public class Nährstoffangaben {
    int portionsGroesse;
    int anzahlPortionen;
    double eiweiss;
    double fett;
    double kohlenhydrate;
    double natrium;

    private Nährstoffangaben(int portionsGroesse, int anzahlPortionen, double eiweiss, double fett, double kohlenhydrate, double natrium) {
        this.portionsGroesse = portionsGroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    public static class NährstoffBuilder{
        int portionsGroesse;
        int anzahlPortionen;
        double eiweiss;
        double fett;
        double kohlenhydrate;
        double natrium;

        public NährstoffBuilder(int portionsGroesse, int anzahlPortionen) {
            this.portionsGroesse = portionsGroesse;
            this.anzahlPortionen = anzahlPortionen;
        }

        public NährstoffBuilder eiweiss(double eiweiss) {
            this.eiweiss = eiweiss;
            return this;
        }

        public NährstoffBuilder fett(double fett) {
            this.fett = fett;
            return this;
        }

        public NährstoffBuilder kohlenhydrate(double kohlenhydrate) {
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }

        public NährstoffBuilder natrium(double natrium) {
            this.natrium = natrium;
            return this;
        }

        public Nährstoffangaben build() {
            return new Nährstoffangaben(portionsGroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
        }
    } //end of class Nährstoffbuilder
}//end of class Nährstoffangaben
