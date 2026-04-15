package lektion16;

public interface Roboter extends IntelligenteEntitaet {
    public void arbeiten();
    public void autofahren();
    public Entscheidung entscheide(Gefahr gefahr);
    public void aufladen();
    public void warten();
}
