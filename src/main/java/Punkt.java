public class Punkt
{
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {

        if (zielX < 0 || zielY < 0) throw new RuntimeException("Werte duerfen nicht negativ sein.");
        else if (zielX > 1920) throw new RuntimeException("X darf nicht groeßer als 1920 sein.");
        else if (zielY > 1080) throw new RuntimeException("Y darf nicht groeßer als 1920 sein.");

        x = zielX;
        y = zielY;
    }
}