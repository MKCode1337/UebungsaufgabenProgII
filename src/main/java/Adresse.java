public class Adresse{
    String strasse;
    String hausnummer;
    String postleitzahl;
    String ort;

    public Adresse(String strasse, String hausnummer, String postleitzahl, String ort) {
        if (strasse.charAt(0) > 'A' && strasse.charAt(0) < 'Z') throw new RuntimeException("Strassenname muss mit einem Großbuchgstaben beginnen");
        if (ort.charAt(0) > 'A' && ort.charAt(0) < 'Z') throw new RuntimeException("Ortsname muss mit einem Großbuchgstaben beginnen");
        if (hausnummer.charAt(0) > '0' && hausnummer.charAt(0) < '9') throw new RuntimeException("Ortsname muss mit einer Ziffer beginnen");

        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }

}
