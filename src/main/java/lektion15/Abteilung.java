package lektion15;

public class Abteilung {
    protected String bezeichnung;
    protected Angestellter[] mitarbeiter;
    protected Abteilungsleiter abteilungsleiter;

    public Abteilung(String bezeichnung, Angestellter[] mitarbeiter, Abteilungsleiter abteilungsleiter) {
        this.bezeichnung = bezeichnung;
        this.mitarbeiter = mitarbeiter;
        this.abteilungsleiter = abteilungsleiter;
    }
}
