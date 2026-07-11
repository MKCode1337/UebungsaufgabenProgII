package Klausurvorbereitung.OstapSavchyn.Lektion16.GeräteSteuerung;

public class Lampe implements Bedienbar{
    public void einschalten(){
        System.out.println("Lampe an.");
    }
    public void ausschalten(){
        System.out.println("Lampe aus.");
    }
}
