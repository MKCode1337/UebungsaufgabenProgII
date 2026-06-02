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
                Thread t1 = new Thread(){
                    List<Integer> zahlenListe;
                    @Override
                    public void run() {
                        try (InputStream is = clientSocket.getInputStream();
                             OutputStream os = clientSocket.getOutputStream();
                             ObjectOutputStream oos = new ObjectOutputStream(os);
                             ObjectInputStream ois = new ObjectInputStream(is);) {
                            zahlenListe = (List) ois.readObject();
                            Map serverMap = getPrimzahlenListe();
                            oos.writeObject(serverMap);
                            oos.flush();
                        } catch (IOException | ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
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
                };
                t1.start();
            }
        }
    }
}
