package lektion23;

import java.util.List;

public class BundesligaAnalysator {
    static void main() {
        List<Mannschaft> bundesligaTabelle = Mannschaft.createTabelle();
        System.out.println("Alle Mannschaften mit mehr als 50 Punkten: ");
        bundesligaTabelle.stream().filter(mannschaft -> mannschaft.punkte > 50).forEach(mannschaft -> System.out.println(mannschaft));
        System.out.println("Alle Mannschaftsnamen: ");
        bundesligaTabelle.stream().forEach(mannschaft -> System.out.println(mannschaft.name));
        System.out.println("Alle Mannschaften, die mit F beginnen nach Alphabet sortiert: ");
        //Mappe nur noch das Attribut Name -> Standardsortierung in sorted() wieder verfügbar
        bundesligaTabelle.stream().filter(mannschaft -> mannschaft.name.startsWith("F")).map(manschName -> manschName.name).sorted().forEach(mannschaft -> System.out.println(mannschaft));
        //ALternative: eigener Lamda Ausdruck in sorted()-Methode
        bundesligaTabelle.stream().filter(mannschaft -> mannschaft.name.startsWith("F")).sorted((m1, m2) -> m1.name.compareTo(m2.name)).forEach(mannschaft -> System.out.println(mannschaft));
        System.out.println("Die Mannschaft mit den meisten Gegentoren: ");
        //OrElseGet liefert Object oder Supplier zurück.
        Mannschaft verlierer = bundesligaTabelle.stream().max((i1, i2) -> Integer.compare(i1.gegentore, i2.gegentore)).orElseGet(null); //ifPresent(mannschaft -> System.out.println(mannschaft.name)).;
    }
}