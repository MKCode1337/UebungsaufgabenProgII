package Klausurvorbereitung.Bibiliothek;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bibliothek {
    List<Buch> buecher = new ArrayList<>();

    public void buecherHinzufuegen(List<Buch> buecher){
        this.buecher.addAll(buecher);
        this.buecher.sort(Comparator.naturalOrder());
    }

    public List<Buch> gibBuecherDesAutors(String autor){
        return buecher.stream().filter(b -> b.autor.equals(autor)).toList();
    }
}