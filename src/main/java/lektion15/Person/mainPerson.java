package lektion15.Person;

public class mainPerson {
    public static void main(String[] args) {
        Person[] personen = new Person[100];

        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                personen[i-1] = new Student("Programmieren");
            }
            else {
                personen[i-1] = new Professor("Programmieren");
            }
        }
        for (int i = 0; i <100; i++) {
             System.out.println(personen[i].gibTaetigkeitaus());
        }
    }
}