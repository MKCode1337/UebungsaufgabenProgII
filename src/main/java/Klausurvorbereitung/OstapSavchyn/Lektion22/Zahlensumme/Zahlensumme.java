package Klausurvorbereitung.OstapSavchyn.Lektion22.Zahlensumme;

import java.util.List;

public class Zahlensumme implements Runnable{
    List<Double> zahlen;
    public Zahlensumme(List<Double> zahlen){
        this.zahlen = zahlen;
    }
    public void run(){
        double summe = 0;
        for(Double z:zahlen){
            summe = summe +z;
        }
        System.out.println("Zahlensumme ist: "+summe);
    };
}
