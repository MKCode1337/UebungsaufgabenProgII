package lektion21;

 class Naehrstoffangaben {
    int portionsgroesse;
    int anzahlPortionen;
    int eiweiss;
    int fett;
    int kohlenhydrate;
    int natrium;

    private Naehrstoffangaben(int portionsgroesse, int anzahlPortionen, int eiweiss, int fett, int kohlenhydrate, int natrium) {
        this.portionsgroesse = portionsgroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

     public int getPortionsgroesse() {
         return portionsgroesse;
     }

     public int getAnzahlPortionen() {
         return anzahlPortionen;
     }

     public int getEiweiss() {
         return eiweiss;
     }

     public int getFett() {
         return fett;
     }

     public int getKohlenhydrate() {
         return kohlenhydrate;
     }

     public int getNatrium() {
         return natrium;
     }

     static class Builder{
        int portionsgroesse;
        int anzahlPortionen;
        int eiweiss;
        int fett;
        int kohlenhydrate;
        int natrium;

        public Builder(int portionsgroesse, int anzahlPortionen) {
            this.portionsgroesse = portionsgroesse;
            this.anzahlPortionen = anzahlPortionen;
            this.eiweiss = 0;
            this.fett = 0;
            this.kohlenhydrate = 0;
        }

        public Builder eiweiss(int eiweiss) {
            this.eiweiss = eiweiss;
            return this;
        }

        public Builder fett(int fett) {
            this.fett = fett;
            return this;
        }

        public Builder kohlenhydrate(int kohlenhydrate) {
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }

        public Builder natrium(int natrium) {
            this.natrium = natrium;
            return this;
        }

        public Naehrstoffangaben build() {
            return new Naehrstoffangaben(portionsgroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
        }
    } //end of class Builder
}//end of class Nährstoffangaben
