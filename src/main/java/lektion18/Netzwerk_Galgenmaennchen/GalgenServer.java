package lektion18.Netzwerk_Galgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GalgenServer {
    public static void main(String[] args) {
        final int PORT = 5000;
        try(ServerSocket serverSocket = new ServerSocket(PORT);
            Socket connection = serverSocket.accept();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));)
        {
            String inputLine = "";
            String outputLine = "";
            Game aktuellesSpiel = null;
            boolean spielLaeuft = false;

            do {
                outputLine = "Hallo! Was willst du spielen?";
                inputLine = dialog(outputLine, bw, br);
                if (inputLine.equals("Galgen")) {
                    aktuellesSpiel = new Galgenmaennchen();
                    break;
                }
            } while (true);

            inputLine = dialog(aktuellesSpiel.spielStarten(), bw, br);

            do {
                //Spielzug durchführen
                inputLine = dialog(aktuellesSpiel.spielZug(inputLine), bw, br);
            }
            while (!aktuellesSpiel.istBeendet());
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
