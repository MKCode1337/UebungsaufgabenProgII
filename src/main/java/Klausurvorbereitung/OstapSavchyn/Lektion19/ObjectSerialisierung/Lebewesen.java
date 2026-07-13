package Klausurvorbereitung.OstapSavchyn.Lektion19.ObjectSerialisierung;

import java.io.Serializable;

public abstract class Lebewesen implements Serializable {
    String name;
    public abstract void beschreibe();
    public Lebewesen(String name){this.name = name;}
}
