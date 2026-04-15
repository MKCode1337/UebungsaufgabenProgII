package lektion16;

public interface Mensch extends IntelligenteEntitaet {
    public void arbeiten();
    public void autofahren();
    public Entscheidung entscheide(Gefahr gefahr);
    public void essen();
    public void schlafen();
}
