package lektion18.Studiengangsplitter;

import java.io.*;


public class Studiengangsplitter {
    public static void main(String[] args) {
        String datei = "studiengaenge.txt";
        try {
            splitStudiengaenge(datei);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void splitStudiengaenge(String dateiname) throws MatrikelNummerException {
        try (BufferedReader fr = new BufferedReader(new FileReader(dateiname));
             BufferedWriter fwWInf = new BufferedWriter(new FileWriter("WInfNr.txt"));
             BufferedWriter fwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
             BufferedWriter fwEC = new BufferedWriter(new FileWriter("ECNr.txt"));)
        {
            do
            {
                String line = fr.readLine();
                if (line == null) {
                    System.out.println("Am Ende der Datei angelangt, beende Programm.");
                    break;
                }
                else if (line.startsWith("50")) {
                    fwWInf.write(line);
                    fwWInf.newLine();
                }
                else if (line.startsWith("51")) {
                    fwInf.write(line);
                    fwInf.newLine();
                }
                else if (line.startsWith("61")) {
                    fwEC.write(line);
                    fwEC.newLine();
                }
                else {
                    throw new MatrikelNummerException("Ungültige Matrikelnummer erkannt.");
                }
            }
            while(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}