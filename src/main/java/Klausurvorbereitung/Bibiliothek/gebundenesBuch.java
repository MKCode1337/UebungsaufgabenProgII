package Klausurvorbereitung.Bibiliothek;

public class gebundenesBuch extends Buch  {
    int seitenzahl;
    public gebundenesBuch(String name, String autor, String verlag, int preisInCents, int seitenzahl) {
        super(name, autor, verlag, preisInCents);
        this.seitenzahl = seitenzahl;
    }
}
