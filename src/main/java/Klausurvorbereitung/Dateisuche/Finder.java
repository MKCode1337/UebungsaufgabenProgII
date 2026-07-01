package Klausurvorbereitung.Dateisuche;

import java.io.*;


public class Finder {
    public BufferedReader getSystemInAsBufferedReader() {
        //Teilaufgabe a)
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

    public void findStringInFiles(String searchString, String[] filenames) {
        // Teilaufgabe b)
        for (String filename : filenames) {
            try (FileReader fr = new FileReader(filename);
                 BufferedReader br = new BufferedReader(fr);) {
                int zeilencounter = 0;
                 while(true){
                    String line = br.readLine();
                    zeilencounter++;
                    if (line==null) break;
                    if (line.contains(searchString)){
                        System.out.println("Treffer für Suchstring: \""+searchString+"\" in Datei: "+filename+" in Zeile: "+zeilencounter);
                    }
                 }

            } catch (IOException e) {
                System.out.print("Datei: "+filename+" konnte nicht geöffnet werden. Fahre mit nächster Datei fort.");
            }
        }
    }

    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}
