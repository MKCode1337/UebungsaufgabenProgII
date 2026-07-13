package Klausurvorbereitung.OstapSavchyn.Lektion19.ObjectSerialisierung;

public class Tier extends Lebewesen{
    String art;
    public void beschreibe(){
        System.out.println("Dies ist ein Tier der Art "+this.art+" namens: "+this.name);
    }
    public Tier(String name, String art) {
        super(name);
        this.art = art;
    }
}
