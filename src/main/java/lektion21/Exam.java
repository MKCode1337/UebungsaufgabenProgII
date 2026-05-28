package lektion21;

import java.io.*;
import java.util.HashSet;

public class Exam {
    //Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
    String readHeaderFromFile() {
        return "";
    }
    HashSet<Question> questions = new HashSet<Question>();

    public void readQuestions() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("questions.csv"))) {
            String line;
            do {
                line = br.readLine();
                Question.toQuestion(line);
            }
            while (line != null);
        }
    }
    public void toTest() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.tex"))) {
            bw.write(readHeaderFromFile());
            for (Question q : questions) {
                String fragetext = "\\textbf{" + q.text + "}\\\\";
                bw.write(fragetext);
                bw.newLine();
                bw.flush();
            }
            bw.write("\\end{document}");
            bw.flush();
        }
    }
    public class Question {
        String text; //Fragentext
        public Question(String line) {
            this.text = line;
        }
        //Wandelt eine eingelesene Zeile in ein Question-Objekt um
        public static Question toQuestion(String line) {
            return null;}
    }
}
