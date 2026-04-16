package lektion15.Quiz;

import java.util.ArrayList;
import java.util.List;

// QuizBogen: verwaltet Fragen und generiert den Bogen

public class Quizbogen {
    private String titel;
    private List<Frage> fragen;

    public Quizbogen(String titel) {
        this.titel = titel;
        this.fragen = new ArrayList<>();
    }

    public void frageHinzufuegen(Frage frage) {
        fragen.add(frage);
    }

    public String generieren() {
        StringBuilder sb = new StringBuilder();

        // Kopfzeile
        sb.append("=".repeat(60)).append("\n");
        sb.append("  QUIZBOGEN: ").append(titel).append("\n");
        sb.append("=".repeat(60)).append("\n\n");

        // Fragen
        for (int i = 0; i < fragen.size(); i++) {
            sb.append("Frage ").append(i + 1).append(": ");
            sb.append(fragen.get(i).formatieren()).append("\n");
        }

        return sb.toString();
    }
}
