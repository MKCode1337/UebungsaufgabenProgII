package lektion15;

public abstract class Frage {
    protected String frageText;

    public Frage(String frageText) {
        this.frageText = frageText;
    }

    /** Gibt die Frage als formatierten Text zurueck. */
    public abstract String formatieren();
}
