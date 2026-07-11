package Klausurvorbereitung.OstapSavchyn.Lektion16.Superkräfte;

public class Superheld implements Flugfaehig,Unsichtbar,Stark{
    @Override
    public void fliege() {
        System.out.println("Fliegt.");
    }

    @Override
    public void versteckeDich() {
        System.out.println("Ist unsichtbar.");
    }

    @Override
    public void hebeGewicht(int kg) {
        System.out.println("Hebt "+kg+" Kilo!");
    }
}
