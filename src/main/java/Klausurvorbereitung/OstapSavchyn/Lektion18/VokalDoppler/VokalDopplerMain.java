package Klausurvorbereitung.OstapSavchyn.Lektion18.VokalDoppler;

import java.io.*;

public class VokalDopplerMain {
    static void main(){
        try(BufferedReader br = new BufferedReader(new FileReader ("Haus.txt"));
            BufferedWriter bw = new BufferedWriter(new DoubleVowelWriter (new FileWriter ("zielhaus.txt")))){
            String line = "";
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}