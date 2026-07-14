package Klausurvorbereitung.OstapSavchyn.Lektion20.VergleichSortierungBuecher;

public class Buch implements Comparable<Buch> {
    String titel;
    int seiten;
    public Buch(String titel, int seiten){
        this.seiten = seiten;
        this.titel=titel;
    }

    @Override
    public int compareTo(Buch b) {
        if (this.seiten == b.seiten) return this.titel.compareTo(b.titel);
        else return Integer.compare(this.seiten, b.seiten);
    }

    @Override
    public String toString() {
        return "Titel:"+this.titel+" Seiten: "+this.seiten;
    }
}
