package lektion22.Baum_Visitor;
import lektion22.Baum_Visitor.Baum.Knoten;

public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
