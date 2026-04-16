package lektion15.Quiz;

public class QuizApp {
    public static void main(String[] args) {

        Quizbogen quiz = new Quizbogen("Allgemeinwissen");

        // --- Textfragen ---
        quiz.frageHinzufuegen(new Textfrage(
                "Was ist die Hauptstadt von Deutschland?"));

        quiz.frageHinzufuegen(new Textfrage(
                "Wie heisst der laengste Fluss der Welt?"));

        quiz.frageHinzufuegen(new Textfrage(
                "In welchem Jahr begann der Zweite Weltkrieg?"));

        quiz.frageHinzufuegen(new Textfrage(
                "Welches chemische Symbol hat Gold?"));

        // --- Multiple-Choice-Fragen ---
        quiz.frageHinzufuegen(new MultipleChoiceFrage(
                "Wie viele Protonen hat ein Wasserstoff-Atom?",
                new String[]{"4", "2", "1", "0"}
        ));

        quiz.frageHinzufuegen(new MultipleChoiceFrage(
                "Welcher Planet ist der groesste in unserem Sonnensystem?",
                new String[]{"Saturn", "Jupiter", "Neptun", "Uranus"}
        ));

        quiz.frageHinzufuegen(new MultipleChoiceFrage(
                "Wer schrieb das Theaterstueck 'Faust'?",
                new String[]{"Friedrich Schiller", "Bertolt Brecht",
                        "Johann Wolfgang von Goethe", "Heinrich Heine"}
        ));

        quiz.frageHinzufuegen(new MultipleChoiceFrage(
                "Welches ist das kleinste Land der Welt?",
                new String[]{"Monaco", "San Marino", "Liechtenstein", "Vatikanstadt"}
        ));

        // Quizbogen auf der Konsole ausgeben
        System.out.println(quiz.generieren());
    }
}
