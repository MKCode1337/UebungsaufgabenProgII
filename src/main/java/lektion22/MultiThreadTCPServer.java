package lektion22;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadTCPServer {
    public static void main(String[] args) throws Exception{
        final int PORT = 5000;
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client verbunden. ");
                ClientThread ct = new ClientThread(clientSocket);
                Thread t = new Thread(ct);
                t.start();
            }
        }
    }
}
