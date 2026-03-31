package lektion15;

public class Professor extends Person {

    @Override
    public void gibTaetigkeitaus() {
        System.out.println("Der Professor unterrichtet das Fach "+this.fach+".");
    }

    public Professor(String fach) {
        this.fach = fach;
    }
}
