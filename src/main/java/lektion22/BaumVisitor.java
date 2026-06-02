package lektion22;
import lektion22.Baum.Knoten;

public class BaumVisitor<E> implements Visitor<E>{
    int anzahlKnoten;
    public BaumVisitor() {
        this.anzahlKnoten = 0;
    }
    @Override
    public void visit(Knoten<E> knoten) {
        System.out.print(knoten.content);
        anzahlKnoten++;
    }
    public int getAnzahlKnoten() {
        return anzahlKnoten;
    }
}
