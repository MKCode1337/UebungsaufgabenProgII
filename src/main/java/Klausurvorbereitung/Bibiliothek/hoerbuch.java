package Klausurvorbereitung.Bibiliothek;

public class hoerbuch extends Buch{
    String sprecher;
    int spieldauer;

    public hoerbuch(String name, String autor, String verlag, int preisInCents, String sprecher, int spieldauer) {
        super(name, autor, verlag, preisInCents);
        this.sprecher = sprecher;
        this.spieldauer = spieldauer;
    }
}
