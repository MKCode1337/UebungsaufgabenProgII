package Klausurvorbereitung.BaumVisitor;

public class BaumVisitorImpl<E> implements Visitor<E>{
     int anzahlKnoten;

    public BaumVisitorImpl() {
        this.anzahlKnoten = 0;
    }

    @Override
    public void visit(Baum.Knoten<E> current) {
        anzahlKnoten++;
    }

    public int getAnzahlKnoten(){
        return anzahlKnoten;
    }
}
