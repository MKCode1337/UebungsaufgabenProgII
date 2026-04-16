package lektion16;

import java.util.Random;

public class Cyborg implements Mensch,Roboter {
    Mensch menschTeil = new MenschImpl();
    Roboter roboterTeil = new RoboterImpl();

    @Override
    public void arbeiten() {

    }

    @Override
    public void autofahren() {

    }

    @Override
    public Entscheidung entscheide(Gefahr gefahr) {
        Entscheidung menschEnt = menschTeil.entscheide(gefahr);
        Entscheidung roboterEnt = roboterTeil.entscheide(gefahr);
        if(menschEnt.equals(roboterEnt)) {
            return menschEnt;
        }
        else {
            Random random = new Random();
            random.nextBoolean();
            if(random.nextBoolean()) {
                return menschEnt;
            }
            else return roboterEnt;
        }
    }

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }

    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

    }
    @Override
    public String toString() {
        return "Cyborg";
    }
}
