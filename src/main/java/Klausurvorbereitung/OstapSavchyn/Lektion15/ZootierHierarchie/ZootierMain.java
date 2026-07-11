package Klausurvorbereitung.OstapSavchyn.Lektion15.ZootierHierarchie;

public class ZootierMain {
    static void main(){
        Zootier[] tiere = {new Löwe(), new Papagei(), new Elefant(),};
        for (Zootier z: tiere){
            z.makeSound();
        }
    }
}
