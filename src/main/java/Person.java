public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (vorname.charAt(0) > 'A' && vorname.charAt(0) < 'Z') throw new RuntimeException("Vorname muss mit einem Großbuchgstaben beginnen");

        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
}

