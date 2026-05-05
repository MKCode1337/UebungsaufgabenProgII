package lektion19.NetzwerkGalgenmännchenmitObjekten;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GalgenClientObj {
    public static void main(String[] args)
    {
        final int PORT = 5000;
        final String HOST = "localhost";
        try (Socket connection = new Socket(HOST, PORT);
             OutputStream os = connection.getOutputStream();
             InputStream is = connection.getInputStream();
             Scanner sc = new Scanner(System.in);
             ObjectInputStream ois = new ObjectInputStream(is);
             ObjectOutputStream oos = new ObjectOutputStream(os);)
        {
            String eingabe = "";
            String antwort = "";
            do {
                //Empfangen
                SpielNachricht msg = (SpielNachricht) ois.readObject();
                antwort = msg.text;
                System.out.println(antwort+"\n");
                if (msg.treffer) {System.out.println("Treffer!\n");}

                //Eingabe einlesen
                eingabe = sc.nextLine();
                if (eingabe.isEmpty()) {eingabe = " ";}
                msg = new SpielNachricht(eingabe);
                oos.writeObject(msg);
                oos.flush();
            }
            while(!antwort.equals("Gewonnen!") && !antwort.equals("Verloren!"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
