package lektion15;

public class Student extends Person {

    @Override
    public void gibTaetigkeitaus() {
        System.out.println("Der Student besucht das Fach "+this.fach+".");
    }

    public Student(String fach) {
        this.fach = fach;
    }
}
