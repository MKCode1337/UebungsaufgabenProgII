package Klausurvorbereitung.OstapSavchyn.Lektion20.VergleichSortierungBuecher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuchMain {
    static void main(){
        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("ABuch",100));
        buecher.add(new Buch("BBuch",500));
        buecher.add(new Buch("CBuch",1600));
        buecher.add(new Buch("DBuch",100));
        buecher.add(new Buch("DBuch",90));
        buecher.sort(Comparator.naturalOrder());
        for(Buch b:buecher){
            System.out.println(b.toString());
        }
    }
}
