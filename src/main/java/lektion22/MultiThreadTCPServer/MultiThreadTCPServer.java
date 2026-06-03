package lektion22.MultiThreadTCPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiThreadTCPServer {
    public static void main(String[] args) throws Exception{
        final int PORT = 5000;
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client verbunden. ");
                ClientThread clientThread = new ClientThread(clientSocket);
                Thread t1 = new Thread(clientThread);
                t1.start();
            }
        }
    }//Ende Main

    static class ClientThread implements Runnable {
        Socket clientSocket;
        List<Integer> zahlenListe;
        @Override
        public void run() {
            try ( Socket clientSocket = this.clientSocket;
                  InputStream is = clientSocket.getInputStream();
                 OutputStream os = clientSocket.getOutputStream();
                 ObjectOutputStream oos = new ObjectOutputStream(os);
                 ObjectInputStream ois = new ObjectInputStream(is);) {
                zahlenListe = (List) ois.readObject();
                Map<Integer, Boolean> serverMap = getPrimzahlenListe();
                oos.writeObject(serverMap);
                oos.flush();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        public ClientThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        public Map<Integer, Boolean> getPrimzahlenListe() {
            Map<Integer,Boolean> primzahlenMap = new HashMap<>();
            for (Integer i : zahlenListe) {
                if (istPrimzahl(i)) {
                    primzahlenMap.put(i, true);
                }
                else  {
                    primzahlenMap.put(i, false);
                }
            }
            return primzahlenMap;
        }

        public boolean istPrimzahl(int zahl) {
            if (zahl < 2) return false;
            for (int divisor = 2; divisor < zahl; divisor++)
                if (zahl % divisor == 0) return false;
            return true;
        }
    }
}
