package lektion23;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.compare;

public class BundesligaAnalysator {
    static void main() {
        List<Mannschaft> bundesligaTabelle = Mannschaft.createTabelle();
        System.out.println("Alle Mannschaften mit mehr als 50 Punkten: ");
        bundesligaTabelle.stream().filter(mannschaft -> mannschaft.punkte > 50).forEach(mannschaft -> System.out.println(mannschaft.punkte));
        System.out.println("Alle Mannschaftsnamen: ");
        bundesligaTabelle.stream().forEach(mannschaft -> System.out.println(mannschaft.name));
    }
}
