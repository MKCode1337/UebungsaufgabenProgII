package lektion16.Cyborg;

import java.util.Random;

public class MenschImpl implements Mensch {
    @Override
    public void arbeiten() {

    }

    @Override
    public void autofahren() {

    }

    @Override
    public Entscheidung entscheide(Gefahr gefahr) {
        Entscheidung entscheidung;
        Random random = new Random();
        if (random.nextInt(4) == 0) {
            entscheidung = Entscheidung.UNENTSCHIEDEN;
            return entscheidung;
        }
        else {
            switch (gefahr) {
                case GEFAHR_LINKS:
                    entscheidung = Entscheidung.RECHTS;
                    break;
                case GEFAHR_RECHTS:
                    entscheidung = Entscheidung.LINKS;
                    break;
                case GEFAHR_VORNE:
                    entscheidung = Entscheidung.BREMSEN;
                    break;
                default:
                    entscheidung = Entscheidung.UNENTSCHIEDEN;
            }
            return entscheidung;
        }
    }

    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

    }

    @Override
    public String toString() {
        return "Mensch";
    }
}
