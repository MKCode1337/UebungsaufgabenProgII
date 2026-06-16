package lektion22.Kreuzwortraetsel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        Comparator<String> wortComparator = new WortComparator();
        TreeSet<String> t = new TreeSet<>(wortComparator);
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}