package lektion22.MultiThreadTCPServer;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class TCPClient1 {
    static void main() {
        final int PORT = 5000;
        final String HOST = "localhost";
        ArrayList<Integer> primListe = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        try (Socket connection = new Socket(HOST, PORT);
             OutputStream os = connection.getOutputStream();
             InputStream is = connection.getInputStream();
             ObjectInputStream ois = new ObjectInputStream(is);
             ObjectOutputStream oos = new ObjectOutputStream(os);)
        {
            oos.writeObject(primListe);
            oos.flush();
            Map<Integer,Boolean> serverMap = (Map<Integer, Boolean>) ois.readObject();

            for (Object obj : serverMap.keySet()){
                System.out.println(obj + " -> " + serverMap.get(obj));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
