package Klausurvorbereitung.OstapSavchyn.Lektion22.TreeSetComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetmitAnonComparator {
    TreeSet<String> woerter = new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    });
}