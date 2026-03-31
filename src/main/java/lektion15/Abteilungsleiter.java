package lektion15;

import java.time.LocalDate;

public class Abteilungsleiter extends Angestellter {

    public Abteilungsleiter(String nachname, String vorname, int ID, int grundgehalt, LocalDate geburtsdatum) {
        super(nachname, vorname, ID, grundgehalt, geburtsdatum);
        this.gehaltsFaktor = 2.0;
        this.gehalt = grundgehalt*this.gehaltsFaktor;
    }
    public void befoerdern(Angestellter angestellter) {
        angestellter.gehaltsFaktor += 0.1;
    }
}
