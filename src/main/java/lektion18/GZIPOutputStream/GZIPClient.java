package lektion18.GZIPOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class GZIPClient {
    public static void main(String[] args) throws IOException {
        {
            try (Socket connectionToHost = new Socket("localhost", 5555);
                 OutputStream os = connectionToHost.getOutputStream();
                 GZIPOutputStream gos = new GZIPOutputStream(os);)
            {
                byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
                gos.write(bytesToTransfer);
                gos.flush();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}