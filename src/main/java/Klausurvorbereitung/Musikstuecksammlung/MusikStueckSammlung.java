package Klausurvorbereitung.Musikstuecksammlung;

import java.util.*;

public class MusikStueckSammlung {
    Map<String, MusikStueck> musiksammlung = new HashMap<>();

    public void musikStueckEinfuegen(MusikStueck neu){
        if (musiksammlung.containsKey(neu.titel)){
            throw new IllegalArgumentException("Der Titel:\""+neu.titel+"\" ist bereits vorhanden!");
        }
        else {
            musiksammlung.put(neu.titel, neu);
        }
    }
    private List<MusikStueck> gibSortierteMusikStuecke(Comparator<MusikStueck> comp){
        List<MusikStueck> alleMusikStuecke = new ArrayList<>();
        alleMusikStuecke.addAll(musiksammlung.values());
        alleMusikStuecke.sort(comp);
        return alleMusikStuecke;
    }

    public List<MusikStueck> getAlleMusikStueckeNachTitel(){
        Comparator<MusikStueck> comp = new VergleicheMusikStueckTitel();
        return gibSortierteMusikStuecke(comp);
    }

    public List<MusikStueck> getAlleMusikStueckeNachLaenge(){
        Comparator<MusikStueck> comp = new VergleicheMusikStueckLaenge();
        return gibSortierteMusikStuecke(comp);
    }
}
