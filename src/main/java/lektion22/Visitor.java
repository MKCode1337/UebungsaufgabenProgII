package lektion22;
import lektion22.Baum.Knoten;

public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
