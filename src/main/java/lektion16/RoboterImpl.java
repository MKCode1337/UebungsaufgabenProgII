package lektion16;

import static lektion16.Gefahr.GEFAHR_LINKS;

public class RoboterImpl implements Roboter {
    @Override
    public void arbeiten() {

    }

    @Override
    public void autofahren() {

    }

    @Override
    public Entscheidung entscheide(Gefahr gefahr) {
        Entscheidung entscheidung;
        switch (gefahr) {
            case GEFAHR_LINKS:
                entscheidung = Entscheidung.RECHTS;
                break;
            case GEFAHR_RECHTS:
                entscheidung = Entscheidung.LINKS;
                break;
            case GEFAHR_VORNE:
                entscheidung = Entscheidung.BREMSEN;
            default:
                entscheidung = Entscheidung.UNENTSCHIEDEN;
        }
        return entscheidung;
    }

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }
}
