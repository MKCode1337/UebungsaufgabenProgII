package lektion16.Cyborg;

public interface IntelligenteEntitaet {
    public void arbeiten();
    public void autofahren();
    public Entscheidung entscheide(Gefahr gefahr);
}
