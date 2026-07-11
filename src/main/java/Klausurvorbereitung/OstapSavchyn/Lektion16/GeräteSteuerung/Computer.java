package Klausurvorbereitung.OstapSavchyn.Lektion16.GeräteSteuerung;

public class Computer implements Bedienbar{
    int starts;

    public Computer() {
        this.starts = 0;
    }

    public void einschalten(){
        starts++;
        System.out.println("PC an.");
    }
    public void ausschalten(){
        System.out.println("PC aus.");
    }
}
