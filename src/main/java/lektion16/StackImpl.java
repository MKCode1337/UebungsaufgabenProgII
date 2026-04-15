package lektion16;

import java.util.ArrayList;

public class StackImpl implements IStack {
    ArrayList list = new ArrayList();

    public void push(Object obj) {
        this.list.add(obj);
    }
    public Object pop() {
        if (this.list.isEmpty()) throw new RuntimeException("Der Stack ist leer.");
        Object pop = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return pop;
    }
    public Object get(int index) {
        return this.list.get(index);
    }
}
