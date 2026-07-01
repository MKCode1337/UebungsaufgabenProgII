package Klausurvorbereitung.Bibiliothek;

public abstract class Buch implements Comparable<Buch>, IBuch {
    String name;
    String autor;
    String verlag;
    int preisInCents;
    Buchreihe reihe;

    public Buch(String name, String autor, String verlag, int preisInCents) {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }

    @Override
    public int compareTo(Buch b) {
        if (this.autor.equals(b.autor)) {
            return this.name.compareTo(b.name);
        }
        else return this.autor.compareTo(b.autor);
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
