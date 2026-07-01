package Klausurvorbereitung.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RouletteZahlenIterator implements Iterator<Integer> {
    int nullcounter = 0;

    @Override
    public boolean hasNext() {
        if (nullcounter >= 3) return false;
        else return true;
    }

    @Override
    public Integer next() throws NoSuchElementException{
        if (nullcounter >= 3) throw new NoSuchElementException();

        Random random = new Random();
        int zufallszahl = random.nextInt(37);
        if (zufallszahl == 0) nullcounter++;
        return zufallszahl;
    }

    @Override
    public void remove() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}
