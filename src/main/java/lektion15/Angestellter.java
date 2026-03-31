package lektion15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Angestellter {
    public String nachname;
    public String vorname;
    public int ID;
    public int grundgehalt;
    public double gehaltsFaktor;
    public  LocalDate geburtsdatum;
    protected double gehalt;

    public Angestellter(String nachname, String vorname, int ID, int grundgehalt, LocalDate geburtsdatum) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.ID = ID;
        this.grundgehalt = grundgehalt;
        this.gehaltsFaktor = 1.0;
        this.geburtsdatum = geburtsdatum;
        this.gehalt = grundgehalt*this.gehaltsFaktor;
    }

    public double getGehalt() {
        this.gehalt = this.gehaltsFaktor*this.grundgehalt;
        return this.gehalt;
    }

    public Angestellter() {
    }
}
