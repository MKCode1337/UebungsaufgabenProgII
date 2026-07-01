package Klausurvorbereitung.Iterator;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>
{
    @Override
    public Iterator<Integer> iterator()
    {
        return new RouletteZahlenIterator();
    }
    static void main(){
        RouletteZahlen rouletteZahlen = new RouletteZahlen();

        //Aufgabe b)
        for (int i = 0; i <= 100; i++){
            System.out.print(rouletteZahlen.iterator().next()+"\n");
        }

        //Aufgabe c)
        RouletteZahlenIterator zahlenIterator = new RouletteZahlenIterator();
        while(zahlenIterator.hasNext()){
            System.out.print(zahlenIterator.next()+"\n");
        }
    }
}