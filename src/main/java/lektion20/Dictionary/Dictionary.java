package lektion20.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    Map<String, List<String>> english2German = new HashMap<>();

    public void put(String engWord,String deWord) {
        //Prüfe ob engWord schon vorhanden und füge neuen Eintrag ein
        ArrayList<String> deWords = new ArrayList<>();
        if (english2German.containsKey(engWord)) {
            deWords = (ArrayList<String>) english2German.get(engWord);
            deWords.add(deWord);
            english2German.put(engWord,deWords);
        }
        //ODER: Füge deWord zu Liste hinzu
        else {
            deWords.add(deWord);
            english2German.put(engWord,deWords);
        }
    }
    public List<String> get(String engWord) {
        return english2German.get(engWord);
    }
}
