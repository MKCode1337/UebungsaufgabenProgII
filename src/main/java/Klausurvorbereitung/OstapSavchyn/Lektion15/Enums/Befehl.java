package Klausurvorbereitung.OstapSavchyn.Lektion15.Enums;

public enum Befehl {
    START,
    STOP,
    PAUSE,
    RESET;

    public void ausfuehren(){
        System.out.println(switch(this) {
            case START -> "Starte...";
            case STOP -> "Stoppe...";
            case PAUSE -> "Pausiere...";
            case RESET -> "Resette...";
        });
    }
}
