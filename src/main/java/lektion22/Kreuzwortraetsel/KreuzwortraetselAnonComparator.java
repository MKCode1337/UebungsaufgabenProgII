package lektion22.Kreuzwortraetsel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class KreuzwortraetselAnonComparator {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        Comparator<String> wortComparator = new Comparator<String>(){
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {return -1;}
                if (s1.length() > s2.length()) {return 1;}
                else {
                    return s1.compareTo(s2);
                }
            }
        };
        TreeSet<String> t = new TreeSet<>(wortComparator);
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}
