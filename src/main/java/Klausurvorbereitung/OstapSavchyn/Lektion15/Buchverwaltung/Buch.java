package Klausurvorbereitung.OstapSavchyn.Lektion15.Buchverwaltung;

public abstract class Buch {
    String titel;
    String autor;

    public Buch(String autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

    public void zeigeInfo(){
        System.out.println("Titel: "+this.titel);
        System.out.println("Autor: "+this.autor);
    };
}
