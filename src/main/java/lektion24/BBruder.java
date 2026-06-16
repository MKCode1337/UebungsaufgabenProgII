package lektion24;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BBruder
{
    String name;
    int bankDrueckenGewicht;
    int knieBeugenGewicht;
    public BBruder(String name, int bankDrueckenGewicht, int
            knieBeugenGewicht)
    {
        this.name = name;
        this.bankDrueckenGewicht = bankDrueckenGewicht;
        this.knieBeugenGewicht = knieBeugenGewicht;
    }

    @Override
    public String toString()
    {
        return String.format(
                "Name: %s, Bankdrücken: %dkg, Kniebeugen %dkg",
                name, bankDrueckenGewicht, knieBeugenGewicht);
    }
    public static void main(String[] args)
    {
        List<BBruder> bBrothers = List.of(new BBruder("Burt", 238, 311),
                new BBruder("Bronski", 200, 274),
                new BBruder("Bruno", 236, 328));

        Optional<String> namen = bBrothers.stream()
                .map(bruder -> bruder.name)
                .reduce((b1, b2) -> b1 + ", " + b2);
        namen.ifPresent(System.out::println);
        double avgBankDrueckenGewicht = bBrothers.stream()
                .mapToDouble(b -> b.bankDrueckenGewicht)
                .reduce(0,(b1, b2) -> b1+b2)/ bBrothers.size();
        System.out.printf("Durchschnittliches Bankdrückgewicht: %.2f%n",avgBankDrueckenGewicht);

        String namenC = bBrothers.stream()
                .map(b -> b.name)
                .collect(Collectors.joining(", "));
        System.out.println("Namen mit Collectors.joining: "+namenC);

        double avgBankDrueckenGewicht2 = bBrothers.stream()
                .mapToDouble(b -> b.bankDrueckenGewicht)
                .average().getAsDouble();
        System.out.printf("Durchschnittliches Bankdrückgewicht: %.2f%n",avgBankDrueckenGewicht2);
    }
}
