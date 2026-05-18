package lektion20.SMS;

import java.io.*;

public class SMS {
    static HandyTastatur handyTastatur = new HandyTastatur();
    //Hauptmethode Einlesen - Übersetzen - Ausgeben, gibt boolean zurück
    //Datei einlesen
    public static boolean smsUmwandeln(String dateiPfad, String ausgabePfad) {
        boolean result = true;
        try(BufferedReader br = new BufferedReader(new FileReader(dateiPfad));
            BufferedWriter bw = new BufferedWriter(new FileWriter(ausgabePfad))){

            do {
                String line = br.readLine();
                if (line == null) {break;}
                String nummernStr = charUmwandeln(line);
                bw.write(nummernStr);
                bw.newLine();
                bw.flush();
            }while (true);
        }
        catch(IllegalTelephoneNumberException | IOException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    //Einen Char auslesen
    //Ziffer zuordnen
    //Ziffer in rückgabewert speichern
    //rückgabe ausgeben
    public static String charUmwandeln(String zeichenStr) throws IllegalTelephoneNumberException {
        String nummernStr = "";
        for (int i = 0; i < zeichenStr.length(); i++) {
            Character ch = zeichenStr.charAt(i);
            ch = Character.toUpperCase(ch);

            if (handyTastatur.containsKey(ch)) {
                int value = handyTastatur.get(ch);
                nummernStr += value;
            }
            if (!handyTastatur.containsKey(ch))throw new IllegalTelephoneNumberException("Unerlaubtes Zeichen: " + ch);
        }
        return nummernStr;
    }
}
