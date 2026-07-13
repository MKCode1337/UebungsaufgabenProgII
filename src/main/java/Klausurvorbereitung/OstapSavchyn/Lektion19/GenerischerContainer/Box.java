package Klausurvorbereitung.OstapSavchyn.Lektion19.GenerischerContainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> elemente = new ArrayList<>();
    public void add(T obj){
        elemente.add(obj);
    }
    public T max(){
        return Collections.max(elemente);
    }
}