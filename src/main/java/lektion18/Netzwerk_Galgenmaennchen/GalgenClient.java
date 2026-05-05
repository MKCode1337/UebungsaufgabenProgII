package lektion18.Netzwerk_Galgenmaennchen;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GalgenClient {
    public static void main(String[] args)
    {
        final int PORT = 5000;
        final String HOST = "localhost";
        try (Socket connection = new Socket(HOST, PORT);
             OutputStream os = connection.getOutputStream();
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
             InputStream is = connection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is));
             Scanner sc = new Scanner(System.in);)
        {
            String eingabe = "";
            String antwort = "";
            do {
                //Empfangen
                antwort = br.readLine();
                System.out.println(antwort+"\n");

                //Eingabe einlesen
                eingabe = sc.nextLine();
                if (eingabe.isEmpty()) {eingabe = " ";}
                bw.write(eingabe);
                bw.newLine();
                bw.flush();
            }
            while(!antwort.equals("Gewonnen!") && !antwort.equals("Verloren!"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
