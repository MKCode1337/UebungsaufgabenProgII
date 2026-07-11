package Klausurvorbereitung.OstapSavchyn.Lektion15.Buchverwaltung;

public class Roman extends Buch{
    String genre;

    public Roman(String autor, String titel, String genre) {
        super(autor, titel);
        this.genre = genre;
    }
    @Override
    public void zeigeInfo(){
        super.zeigeInfo();
        System.out.println("Typ: Roman, Genre: "+genre);
    }
}
