package lektion18.Netzwerk_Galgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GalgenServer {
    public static void main(String[] args) {
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));)
        {
            String inputLine = "";
            String outputLine = "";

            String[] wort = {"PROGRAMMIERSPRACHE", "TEST"};
            int zufallsIndex = (int) (Math.random()* wort.length);
            char[] rateWort = wort[zufallsIndex].toCharArray();
            boolean spielAus = false;

            do {
                //PROGRAMMLOGIK
                char[] eingabeN = new char[15];
                char[] loesung = new char[rateWort.length];
                int versucheCounter=0;

                for (int i = 0; i < 15; i++) {
                    // Ausgabe aufbauen
                    outputLine = i+1+". Versuch: ";

                    for (int n = 0; n < rateWort.length; n++) {
                        char ausgabe = '_';
                        for (int j = 0; j < eingabeN.length; j++) {
                            if (rateWort[n] == eingabeN[j]) {
                                ausgabe = rateWort[n];
                                loesung[n] = rateWort[n];
                                break;
                            }
                        }
                        outputLine += ausgabe+" ";
                    }

                    //Gewinnbedingung prüfen
                    String loesungswort = String.valueOf(rateWort);
                    String eingabeWort = String.valueOf(loesung);
                    if (loesungswort.equals(eingabeWort)) {
                        dialog("Gewonnen!", bw, br);
                        spielAus = true;
                    }
                    else {
                        inputLine = dialog(outputLine+" Buchstabe eingeben: ", bw, br);
                        eingabeN[i] = inputLine.toUpperCase().charAt(0);
                        versucheCounter++;
                    }

                }
                if (versucheCounter == 15) dialog("Verloren!", bw, br); spielAus = true;
            }
            while(!spielAus);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static String dialog(String output, BufferedWriter bw, BufferedReader br) throws IOException {
        bw.write(output+"\n");
        bw.flush();
        String antwort = br.readLine();
        return antwort;
    }
}
