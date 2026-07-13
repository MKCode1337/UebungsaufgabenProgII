package Klausurvorbereitung.OstapSavchyn.Lektion19.ObjectSerialisierung;

public class Mensch extends Lebewesen{
    String beruf;
    public void beschreibe(){
        System.out.println("Dies ist ein Mensch.");
        System.out.println("Der Name ist: "+this.name+"\nDer Beruf ist: "+this.beruf);
    }

    public Mensch(String name, String beruf) {
        super(name);
        this.beruf = beruf;
    }
}
