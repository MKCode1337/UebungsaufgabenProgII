package Klausurvorbereitung.Bibiliothek;

public class gebundenesBuch extends Buch implements IBuch {
    int seitenzahl;
    public gebundenesBuch(String name, String autor, String verlag, int preisInCents, int seitenzahl) {
        super(name, autor, verlag, preisInCents);
        this.seitenzahl = seitenzahl;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }
}
