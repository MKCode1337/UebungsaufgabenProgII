package lektion20.Dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    Map<String, List<String>> english2German = new HashMap<>();

    public void put(String engWord,String deWord) {
        //Prüfe ob engWord schon vorhanden
        //Füge neuen Eintrag ein
        //ODER: Füge deWord zu Liste hinzu
    }
    public List<String> get(String engWord) {
        return english2German.get(engWord);
    }
}
