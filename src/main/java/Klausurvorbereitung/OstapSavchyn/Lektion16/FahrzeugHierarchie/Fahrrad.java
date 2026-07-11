package Klausurvorbereitung.OstapSavchyn.Lektion16.FahrzeugHierarchie;

public class Fahrrad extends Fahrzeug{
    public Fahrrad(){
        this.geschwindigkeit = 40;
    }
    @Override
    public void beschleunige(int delta) {
        if(delta <= 40) System.out.println(Integer.toString(delta));
        else System.out.println(40);
    }
}
