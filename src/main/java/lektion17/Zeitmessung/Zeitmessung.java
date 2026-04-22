package lektion17.Zeitmessung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Zeitmessung {
    public static void main(String[] args) {
        dateipfadEinlesen();
    }

    public static FileInputStream dateipfadEinlesen(){
        boolean korrekterPfad = false;
        FileInputStream fis =  null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dateipfad eingeben: " + "\n");
            String eingabe = sc.nextLine();
            try{
                fis =  new FileInputStream(eingabe);
                korrekterPfad = true;
            } catch (FileNotFoundException e) {
                fis = null;
                System.out.println("Datei nicht gefunden!");
                korrekterPfad = false;
            }
            finally {
                try {
                    if (fis != null) fis.close();
                }
                catch (IOException e) {
                }
            }
        }while (!korrekterPfad);
        sc.close();
        return fis;
    }
}
