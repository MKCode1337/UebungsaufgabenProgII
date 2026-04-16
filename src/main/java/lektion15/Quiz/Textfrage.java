package lektion15.Quiz;

public class Textfrage extends Frage {

    public Textfrage(String frageText) {
        super(frageText);
    }

    @Override
    public String formatieren() {
        return frageText + "\n"
                + "Antwort: ___________________________\n";
    }
}