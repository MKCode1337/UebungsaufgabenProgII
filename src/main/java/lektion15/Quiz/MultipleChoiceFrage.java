package lektion15.Quiz;

public class MultipleChoiceFrage extends Frage {
    private String[] antwortmoeglichkeiten;

    public MultipleChoiceFrage(String frageText, String[] antwortmoeglichkeiten) {
        super(frageText);
        this.antwortmoeglichkeiten = antwortmoeglichkeiten;
    }

    @Override
    public String formatieren() {
        StringBuilder sb = new StringBuilder();
        sb.append(frageText).append("\n");
        sb.append("Antwortmoeglichkeiten:\n");

        char buchstabe = 'A';
        for (String antwort : antwortmoeglichkeiten) {
            sb.append("   ").append(buchstabe).append(") ").append(antwort).append("\n");
            buchstabe++;
        }
        sb.append("Ihre Antwort: ___\n");
        return sb.toString();
    }
}
