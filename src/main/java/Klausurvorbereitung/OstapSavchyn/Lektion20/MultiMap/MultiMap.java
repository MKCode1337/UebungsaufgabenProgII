package Klausurvorbereitung.OstapSavchyn.Lektion20.MultiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultiMap<K, V> {
    HashMap<K, ArrayList<V>> multimap = new HashMap<>();
    public void put(K key, V value){
        if (multimap.containsKey(key)){
            ArrayList<V> zwischenliste = multimap.get(key);
            zwischenliste.add(value);
            multimap.put(key, zwischenliste);
        }
        else {
            ArrayList<V> zwischenliste = new ArrayList<>();
            zwischenliste.add(value);
            multimap.put(key, zwischenliste);
        }
    }
    public List<V> get(K key){
        return multimap.get(key);
    };
}