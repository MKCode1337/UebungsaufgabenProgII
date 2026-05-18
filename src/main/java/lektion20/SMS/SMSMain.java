package lektion20.SMS;

import static lektion20.SMS.SMS.smsUmwandeln;

public class SMSMain {
    static void main() {
        //Übergebe Dateipfade Ein-/Ausgabepfad an SMS
        //Wenn True -> Erfolg
        boolean erfolg = smsUmwandeln("Zeichenkontakte.txt", "Nummernkontakte.txt");
        if (erfolg) {System.out.println("Erfolg!");}
        if (!erfolg) {System.out.println("Etwas ist schiefgelaufen!");}
    }
}
