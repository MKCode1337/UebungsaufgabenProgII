package Klausurvorbereitung.OstapSavchyn.Lektion17.DateiKopierenBlockweise;

import java.io.*;

public class DateiKopieMitBuffer {
    static void main(){
        dateiKopierenMitBuffer("quelle.dat", "ziel_Kopie.dat");
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
