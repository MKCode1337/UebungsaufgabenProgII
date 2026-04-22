package lektion17.Zeitmessung;

import java.io.*;
import java.util.Scanner;

public class Zeitmessung {
    public static void main(String[] args) throws FileNotFoundException {

        //Dateipfad einlesen und FileNotFound behandeln
        boolean korrekterPfad = false;
        FileInputStream fislesen =  null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dateipfad eingeben: " + "\n");
            String eingabe = sc.nextLine();
            try{
                fislesen =  new FileInputStream(eingabe);
                korrekterPfad = true;
            } catch (FileNotFoundException e) {
                fislesen = null;
                System.out.println("Datei nicht gefunden!");
                korrekterPfad = false;
            }
        }while (!korrekterPfad);

        //Alle 3 Methoden 1x ausführen
        try (FileInputStream fis = fislesen;
        FileOutputStream fos = new FileOutputStream("ziel.mp3");) {

            long dauer1 = copyByteUnbuffered(fis, fos);
            long dauer2 = copyByteBuffered(fis, fos);
            long dauer3 = copy1024Unbuffered(fis, fos);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //sc.close();
    }

    public static long copyByteUnbuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.currentTimeMillis();
        try
        {
            copySimple(fis, fos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return duration;
    }
    public static long copyByteBuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.currentTimeMillis();
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
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return duration;
    }
    public static long copy1024Unbuffered(FileInputStream fis, FileOutputStream fos) {
        long startTime = System.currentTimeMillis();
        try
        {
            copy1024(fis, fos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
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
