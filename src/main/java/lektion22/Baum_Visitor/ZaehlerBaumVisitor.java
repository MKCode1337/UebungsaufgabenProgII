package lektion22.Baum_Visitor;
import lektion22.Baum_Visitor.Baum.Knoten; //Importieren, weil Klasse Knoten static UND geschachtelt ist? Alternativ: Baum.Knoten als FQCN

public class ZaehlerBaumVisitor<E> implements Visitor<E>{
    int anzahlKnoten;
    public ZaehlerBaumVisitor() {
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
