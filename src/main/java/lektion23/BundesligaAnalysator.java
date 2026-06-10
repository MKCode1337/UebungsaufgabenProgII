package lektion23;

import java.util.List;

public class BundesligaAnalysator {
    static void main() {
        List<Mannschaft> bundesligaTabelle = Mannschaft.createTabelle();
        System.out.println("Alle Mannschaften mit mehr als 50 Punkten: ");
        bundesligaTabelle.stream().filter(mannschaft -> mannschaft.punkte > 50).forEach(mannschaft -> System.out.println(mannschaft.punkte));
        System.out.println("Alle Mannschaftsnamen: ");
        bundesligaTabelle.stream().forEach(mannschaft -> System.out.println(mannschaft.name));
        System.out.println("Alle Mannschaften, die mit F beginnen nach Alphabet sortiert: ");
        bundesligaTabelle.stream().sorted((mannschaft1, mannschaft2) -> mannschaft1.name.compareTo(mannschaft2.name)).filter(mannschaft -> mannschaft.name.startsWith("F")).forEach(mannschaft -> System.out.println(mannschaft.name));
        System.out.println("Die Mannschaft mit den meisten Gegentoren: ");
        bundesligaTabelle.stream().max((i1, i2) -> Integer.compare(i1.gegentore, i2.gegentore)).ifPresent(mannschaft -> System.out.println(mannschaft.name));
    }
}
