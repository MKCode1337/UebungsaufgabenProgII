package lektion19;

import lektion18.Netzwerk_Galgenmaennchen.Galgenmaennchen;
import lektion18.Netzwerk_Galgenmaennchen.Game;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GalgenServerObj {
    public static void main(String[] args) {
        final int PORT = 5000;
        try(ServerSocket serverSocket = new ServerSocket(PORT);
            Socket connection = serverSocket.accept();
            InputStream is = connection.getInputStream();
            OutputStream os = connection.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);)
        {
            String inputLine = "";
            String outputLine = "";
            Game aktuellesSpiel = null;

            do {
                outputLine = "Hallo! Was willst du spielen?";
                SpielNachricht msg = new SpielNachricht(outputLine);
                inputLine = dialog(msg, oos, ois);
                if (inputLine.equals("Galgen")) {
                    aktuellesSpiel = new Galgenmaennchen();
                    break;
                }
            } while (true);

            SpielNachricht msg = new SpielNachricht(aktuellesSpiel.spielStarten());
            inputLine = dialog(msg, oos, ois);

            do {
                //Spielzug durchführen
                msg = new SpielNachricht(aktuellesSpiel.spielZug(inputLine));
                if (aktuellesSpiel.isTreffer()) {msg.treffer = true;}
                if (aktuellesSpiel.istBeendet()) {msg.spielBeendet = true;}
                inputLine = dialog(msg, oos, ois);
            }
            while (!aktuellesSpiel.istBeendet());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static String dialog(SpielNachricht msg, ObjectOutputStream oos, ObjectInputStream ois) throws IOException {
        oos.writeObject(msg);
        oos.flush();
        try {
            msg = (SpielNachricht) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String antwort = msg.text;
        return antwort;
    }
}
