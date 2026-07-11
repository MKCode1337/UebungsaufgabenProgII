package Klausurvorbereitung.OstapSavchyn.Lektion16.FahrzeugHierarchie;

public class Auto extends Fahrzeug{
    public Auto(){
        this.geschwindigkeit = 200;
    }
    @Override
    public void beschleunige(int delta) {
        if(delta <= 200) System.out.println(Integer.toString(delta));
        else System.out.println(200);
    }
}
