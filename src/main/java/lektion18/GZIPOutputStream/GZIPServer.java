package lektion18.GZIPOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public class GZIPServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(5555);
             Socket connection = serverSocket.accept();
             InputStream is = connection.getInputStream();
             GZIPInputStream gis = new GZIPInputStream(is);)
        {
            byte[] input = gis.readAllBytes();
            System.out.println(new String(input));
        }
    }
}
