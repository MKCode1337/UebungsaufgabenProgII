package lektion23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class KreuzwortraetselAnonComparatorLambda {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<>((s1, s2) -> {
            if (s1.length() < s2.length()) {return -1;}
            if (s1.length() > s2.length()) {return 1;}
            else return s1.compareTo(s2);
        });
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}