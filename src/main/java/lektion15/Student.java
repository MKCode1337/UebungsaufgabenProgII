package lektion15;

public class Student extends Person {

    @Override
    public String gibTaetigkeitaus() {
        String ausgabe = "Der Student besucht das Fach "+this.fach+".";
        return ausgabe;
    }

    public Student(String fach) {
        this.fach = fach;
    }
}
