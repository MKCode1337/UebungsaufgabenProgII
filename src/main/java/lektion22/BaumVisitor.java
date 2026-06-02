package lektion22;
import lektion22.Baum.Knoten;

public class BaumVisitor implements Visitor{
    int anzahlKnoten;
    public BaumVisitor() {
        this.anzahlKnoten = 0;
    }
    @Override
    public void visit(Knoten knoten) {
        System.out.print(knoten.content);
        anzahlKnoten++;
    }

    public int getAnzahlKnoten() {
        return anzahlKnoten;
    }
}
