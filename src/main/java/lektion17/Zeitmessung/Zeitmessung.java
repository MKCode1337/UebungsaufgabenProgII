package lektion17.Zeitmessung;

import java.io.*;
import java.util.Scanner;

public class Zeitmessung {
    public static void main(String[] args) {

        //Dateipfad einlesen und FileNotFound behandeln
        boolean korrekterPfad = false;
        FileInputStream fislesen =  null;
        Scanner sc = new Scanner(System.in);
        File quellDatei = null;
        do {
            System.out.println("Dateipfad eingeben: " + "\n");
            String eingabe = sc.nextLine();
            try{
                fislesen =  new FileInputStream(eingabe);
                korrekterPfad = true;
                quellDatei = new File(eingabe);
            } catch (FileNotFoundException e) {
                fislesen = null;
                System.out.println("Datei nicht gefunden!");
                korrekterPfad = false;
            }
        }while (!korrekterPfad);

        int durchlaeufe = 10;
        long[] dauer1 = new long[durchlaeufe];
        long[] dauer2 = new long[durchlaeufe];
        long[] dauer3 = new long[durchlaeufe];

            try (FileInputStream fis = fislesen;
                 FileOutputStream fos = new FileOutputStream("ziel.mp3");) {
                // 10 Durchläufe
                for (int i = 0; i<durchlaeufe; i++){
                    dauer1[i] = copyByteUnbuffered(fis, fos);
                    dauer2[i] = copyByteBuffered(fis, fos);
                    dauer3[i] = copy1024Unbuffered(fis, fos);
                }
                double zeit1 = durchschnitt(dauer1);
                System.out.println("Durchschnittswert unbuffered byteweise: "+zeit1);
                double zeit2 = durchschnitt(dauer2);
                System.out.println("Durchschnittswert buffered byteweise: "+zeit2);
                double zeit3 = durchschnitt(dauer3);
                System.out.println("Durchschnittswert unbuffered 1024: "+zeit3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        sc.close();
        File zielDatei = new File("ziel.mp3");
        System.out.println(" Laenge Zieldatei: " + zielDatei.length()+"\n"+"Laenge Quelldatei: "+quellDatei.length()+"\n");
    }

    public static long copyByteUnbuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.nanoTime();
        try
        {
            copySimple(fis, fos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return duration;
    }
    public static long copyByteBuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.nanoTime();
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        try
        {
            copySimple(bis, bos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return duration;
    }
    public static long copy1024Unbuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.nanoTime();
        try
        {
            copy1024(fis, fos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return duration;
    }
    private static void copySimple(InputStream is, OutputStream os) throws IOException
    {
        int b;
        do
        {
            b = is.read();
            if (b != -1) os.write(b);
        }
        while (b != -1);
    }
    static void copy1024(InputStream is, OutputStream os) throws IOException
    {
        byte[] b = new byte[1024];
        int n;
        do
        {
            n = is.read(b);
            if (n != -1) os.write(b, 0, n);
        }
        while (n != -1);
    }
    private static double durchschnitt(long[] werte){
        long summe = 0;
        int i;
        for(i = 0; i<werte.length; i++){
            summe += werte[i];
        }
        return (double) summe / i;
    }
}
