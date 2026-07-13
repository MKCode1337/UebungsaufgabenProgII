package Klausurvorbereitung.OstapSavchyn.Lektion19.ObjectSerialisierung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LebewesenMain {
    static void main(){
        List<Lebewesen> lebewesen = new ArrayList<>();
        lebewesen.add(new Mensch("Max", "Student"));
        lebewesen.add(new Tier("Finni", "Dackel"));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lebewesen.dat"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lebewesen.dat"))){
            oos.writeObject(lebewesen);
            List<Lebewesen> gelesen = (List<Lebewesen>) ois.readObject();
            for(Lebewesen l:gelesen){l.beschreibe();}
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}