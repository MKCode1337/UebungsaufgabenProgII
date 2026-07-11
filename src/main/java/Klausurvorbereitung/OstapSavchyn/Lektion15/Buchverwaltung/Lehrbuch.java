package Klausurvorbereitung.OstapSavchyn.Lektion15.Buchverwaltung;

public class Lehrbuch extends Buch{
    String fachgebiet;

    public Lehrbuch(String autor, String titel, String fachgebiet) {
        super(autor, titel);
        this.fachgebiet = fachgebiet;
    }

    @Override
    public void zeigeInfo(){
        super.zeigeInfo();
        System.out.println("Typ: Lehrbuch, Fachgebiet: "+fachgebiet);
    }
}
