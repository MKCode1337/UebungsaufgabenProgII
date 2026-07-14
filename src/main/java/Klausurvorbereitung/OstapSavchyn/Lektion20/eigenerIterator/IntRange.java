package Klausurvorbereitung.OstapSavchyn.Lektion20.eigenerIterator;

import java.util.Iterator;

public class IntRange implements Iterable<Integer> {
    int start;
    int end;
    int current;
    public IntRange(int start, int end){
        this.start = start;
        this.end = end;
        this.current = start;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new IntRangeIterator();
    }
    private class IntRangeIterator implements Iterator<Integer> {
        public boolean hasNext() {
            if (current <= end) return true;
            else return false;
        }

        public Integer next() {
            int next = current;
            current++;
            return next;
        }
    }
}