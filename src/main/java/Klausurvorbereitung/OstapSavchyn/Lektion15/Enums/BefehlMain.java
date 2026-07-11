package Klausurvorbereitung.OstapSavchyn.Lektion15.Enums;

import static Klausurvorbereitung.OstapSavchyn.Lektion15.Enums.Befehl.*;

public class BefehlMain {
    static void main(){
        Befehl[] befehle = {START, STOP, PAUSE, RESET};
        for (Befehl b: befehle){
            b.ausfuehren();
        }
    }
}
