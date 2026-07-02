package Klausurvorbereitung.AstronomischesObservatorium;

import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
class MeasurementStorage {
    public static void save(List<? extends NamedMeasurementValue> measurements, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)))) {
            out.writeObject(measurements);
        }
    }

    public static <T extends NamedMeasurementValue> Map<String, List<T>> loadAsMap(String dateiname)throws IOException, ClassNotFoundException {
    //Generic T in Methodensignatur bekannt geben
        List<T> gelesen = new ArrayList<>();
        Map<String, List<T>> werteGeordnet = new HashMap<>();

        try(ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dateiname)))) {
            gelesen = (List<T>) in.readObject();
            if (gelesen.isEmpty()) return new HashMap<>();

            for (T wert: gelesen){
                if (!werteGeordnet.containsKey(wert.getName())){
                    List<T> zwischenListe = new ArrayList<>();
                    zwischenListe.add(wert);
                    werteGeordnet.put(wert.getName(), zwischenListe);
                }
                else {
                    List<T> zwischenListe = (List<T>) werteGeordnet.get(wert.getName());
                    zwischenListe.add(wert);
                    werteGeordnet.put(wert.getName(), zwischenListe);
                }
            }
        }
        return werteGeordnet;
    }
}