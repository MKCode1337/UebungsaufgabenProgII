package lektion16.Cyborg;

public class Autofahrt {
    public static void main(String[] args) {
        Mensch mensch = new MenschImpl();
        Roboter roboter = new RoboterImpl();
        Cyborg cyborg = new Cyborg();
        IntelligenteEntitaet[] fahrer = {mensch, roboter, cyborg};
        Gefahr gefahr;

        //Gefahr Links
        gefahr = Gefahr.GEFAHR_LINKS;
        jederEntscheidungTreffen(fahrer, gefahr);

        //Gefahr Rechts
        gefahr = Gefahr.GEFAHR_RECHTS;
        jederEntscheidungTreffen(fahrer, gefahr);

        // Gefahr vorne
        gefahr = Gefahr.GEFAHR_VORNE;
        jederEntscheidungTreffen(fahrer, gefahr);
    }
    public static void jederEntscheidungTreffen(IntelligenteEntitaet[] fahrer, Gefahr gefahr) {
        System.out.println("Gefahr: "+gefahr+"\n");
        for (int i=0;i < fahrer.length;i++){
        Entscheidung entscheidung = fahrer[i].entscheide(gefahr);
        System.out.print("Fahrer: "+fahrer[i].toString()+"; Entscheidung: "+entscheidung+"\n");
        }
        System.out.println("-----------------------------------"+"\n");
    }
}
