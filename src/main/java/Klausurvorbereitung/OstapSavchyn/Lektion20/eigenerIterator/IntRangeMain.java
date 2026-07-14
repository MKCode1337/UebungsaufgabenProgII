package Klausurvorbereitung.OstapSavchyn.Lektion20.eigenerIterator;

public class IntRangeMain {
    static void main(){
        IntRange range = new IntRange (5, 10);
        for (int i : range) {
            System .out. print (i + " ");
            }
        // Ausgabe : 5 6 7 8 9 10
    }
}
