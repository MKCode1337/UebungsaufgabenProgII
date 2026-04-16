package lektion15.Person;

public class Professor extends Person {

    @Override
    public String gibTaetigkeitaus() {
        String ausgabe = "Der Professor unterrichtet das Fach "+this.fach+".";
        return ausgabe;
    }

    public Professor(String fach) {
        this.fach = fach;
    }
}