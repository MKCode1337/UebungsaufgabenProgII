package lektion17.Streamverdopplung;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream {
    OutputStream OS1;
    OutputStream OS2;

    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream fos1 = new FileOutputStream("file1.txt");
        FileOutputStream fos2 = new FileOutputStream("file2.txt");) {
            OutputStreamDoubler osd = new OutputStreamDoubler(fos1, fos2);
            int[] bytefolge = {65, 66, 67, 68, 69, 70};
            for (int i = 0; i < bytefolge.length; i++) {
                osd.write(bytefolge[i]);
            }
            try {
                osd.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }

    public OutputStreamDoubler(OutputStream OS1, OutputStream OS2) {
        this.OS1 = OS1;
        this.OS2 = OS2;
    }
    public void close() throws IOException {
        boolean excGeworfen = false;
        String fehlerMsg = "";
        try {
            OS1.close();
        }
        catch (IOException e) {
            excGeworfen = true;
            fehlerMsg += "Fehler in Stream 1 ausgeloest."+"\n";
        }
        try {
            OS2.close();
        }
        catch (IOException e) {
            excGeworfen = true;
            fehlerMsg += "Fehler in Stream 2 ausgeloest."+"\n";
        }
        if (excGeworfen) {throw new IOException(fehlerMsg);}
    }
    public void write(int b) {
        try {
            this.OS1.write(b);
        }
        catch (IOException e) {
            e.getStackTrace();
        }
        try {
            this.OS2.write(b);
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }

}
