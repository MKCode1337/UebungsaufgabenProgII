package Klausurvorbereitung.OstapSavchyn.Lektion17.DateiKopieren;

import java.io.*;

public class DateiKopierenMain {
    static void main(){
        dateiKopieren("quelle.dat", "ziel.dat");
    }

    public static void dateiKopieren(String quelle, String ziel){
        try(FileInputStream fis = new FileInputStream(quelle);
            FileOutputStream fos = new FileOutputStream(ziel)){
            int n;
            while((n=fis.read())!=-1){
                fos.write(n);
            }
        }
        catch (FileNotFoundException f){
            System.out.println("Datei: "+quelle+" nicht gefunden!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}