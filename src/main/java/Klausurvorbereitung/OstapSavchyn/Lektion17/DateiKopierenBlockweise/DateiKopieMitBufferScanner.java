package Klausurvorbereitung.OstapSavchyn.Lektion17.DateiKopierenBlockweise;

import java.io.*;
import java.util.Scanner;

public class DateiKopieMitBufferScanner {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dateipfad eingeben: ");
        String line = sc.nextLine();
        dateiKopierenMitBuffer(line, "ziel_Kopie.dat");
        File quellDatei = new File(line);
        File zielDatei = new File("ziel_Kopie.dat");
        if (quellDatei.length() == zielDatei.length()) System.out.println("Datei erfolgreich kopiert!");
    }

    public static void dateiKopierenMitBuffer(String quelle, String ziel){
        try(FileInputStream fis = new FileInputStream(quelle);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ziel));){
            byte[] buffer = new byte[4096];
            int n;
            while((n=bis.read(buffer))!=-1){
                bos.write(buffer,0, n);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei: "+quelle+" nicht gefunden!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
