public class Adresse{
    String strasse;
    String hausnummer;
    String postleitzahl;
    String ort;

    public Adresse(String strasse, String hausnummer, String postleitzahl, String ort) {
        if (!Character.isUpperCase(strasse.charAt(0))) throw new RuntimeException("Strassenname muss mit einem Großbuchstaben beginnen.");
        if (!Character.isDigit(hausnummer.charAt(0))) throw new RuntimeException("Hausnummer muss mit einer Ziffer beginnen.");
        if (!Character.isUpperCase(ort.charAt(0))) throw new RuntimeException("Ortsname muss mit einem Großbuchstaben beginnen.");

        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }
}