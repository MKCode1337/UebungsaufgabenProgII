package lektion21;

import java.io.*;
import java.util.HashSet;

public class Exam {
    //Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
    String readHeaderFromFile() throws IOException {
        String header = "\\documentclass[10pt,a4paper]{article}\n" +
                        "\\usepackage[lmargin=2.5cm, rmargin=2.5cm]{geometry}\n" +
                        "\\usepackage[utf8]{inputenc}\n" +
                        "\\begin{document}\n";
        return header;
    }
    HashSet<Question> questions = new HashSet<Question>();

    public void readQuestions() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("questions.csv"))) {
            String line;
            do {
                line = br.readLine();
                questions.add(Question.toQuestion(line));
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
    static class Question {
        String text; //Fragentext
        //Wandelt eine eingelesene Zeile in ein Question-Objekt um
        public static Question toQuestion(String line) {
            Question q = new Question();
            q.text = line;
            return q;
        }
    }
}
