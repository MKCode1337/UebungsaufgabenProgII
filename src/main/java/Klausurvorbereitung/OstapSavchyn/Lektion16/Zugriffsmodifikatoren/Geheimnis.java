package Klausurvorbereitung.OstapSavchyn.Lektion16.Zugriffsmodifikatoren;

public class Geheimnis {
    private String geheim1;     //Zugriff innerhalb der Klasse
    String geheim2;             //Zugriff innerhalb Package
    protected String geheim3;   //Zugriff innerhalb Package und Unterklassen
    public String geheim4;      //Zugriff von überall
}
