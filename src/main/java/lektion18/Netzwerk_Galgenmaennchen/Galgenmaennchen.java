package lektion18.Netzwerk_Galgenmaennchen;

public class Galgenmaennchen extends Game {
    String[] wort = {"PROGRAMMIERSPRACHE", "TEST"};
    int zufallsIndex = (int) (Math.random()* wort.length);
    char[] rateWort = wort[zufallsIndex].toCharArray();
    private boolean spielAus = false;
    char[] eingabeN = new char[15];
    char[] loesung = new char[rateWort.length];
    int versucheCounter=0;

    @Override
    public String spielStarten() {
        return "+++ STARTE SPIEL +++ "+printVersuch();
    }

    @Override
    public String spielZug(String eingabe) {
        //Eingabe verarbeiten
        eingabeN[versucheCounter] = eingabe.toUpperCase().charAt(0);
        versucheCounter++;
        String ausgabe = "";

        //Ausgabe bauen
        ausgabe += printVersuch();
        ausgabe += " Buchstabe eingeben: ";

        //Gewinnbedingung prüfen
        if (gewinnPruefen()) {
            ausgabe = "Gewonnen!";
            spielAus = true;}
        else if (versucheCounter == 15) {
            ausgabe = "Verloren!";
            spielAus = true;
        }
        //Spiellogik ausgeben
        return ausgabe;
    }

    @Override
    public boolean istBeendet() {
        return spielAus;
    }

    public boolean gewinnPruefen() {
        String loesungswort = String.valueOf(rateWort);
        String eingabeWort = String.valueOf(loesung);
        if (loesungswort.equals(eingabeWort)) {
            return true;
        }
        else return false;
    }
    private String printVersuch() {
        String ausgabe = versucheCounter+1+". Versuch: ";;
        for (int n = 0; n < rateWort.length; n++) {
            char ausgabeChar = '_';
            for (int j = 0; j < eingabeN.length; j++) {
                if (rateWort[n] == eingabeN[j]) {
                    ausgabeChar = rateWort[n];
                    loesung[n] = rateWort[n];
                    break;
                }
            }
            ausgabe += ausgabeChar+" ";
        }
        return ausgabe;
    }
}
