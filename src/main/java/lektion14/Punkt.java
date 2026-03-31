package lektion14;

public class Punkt
{
    public int x;
    public int y;

    public void verschiebePunkt(int zielX, int zielY) {

        if (zielX < 0 || zielY < 0) throw new RuntimeException("Werte duerfen nicht negativ sein.");
        else if (zielX > 1920) throw new RuntimeException("X darf nicht groeßer als 1920 sein.");
        else if (zielY > 1080) throw new RuntimeException("Y darf nicht groeßer als 1080 sein.");

        x = zielX;
        y = zielY;
    }
}