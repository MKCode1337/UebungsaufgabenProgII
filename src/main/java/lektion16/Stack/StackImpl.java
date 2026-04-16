package lektion16.Stack;

import java.util.ArrayList;

public class StackImpl implements IStack {
    //Vorteil: StackImpl hat nur seine eigenen Methoden
    ArrayList list = new ArrayList();

    public void push(Object obj) {
        this.list.add(obj);
    }
    public Object pop() {
        if (this.list.isEmpty()) throw new RuntimeException("Der Stack ist leer.");
       return this.list.remove(this.list.size() - 1);
    }
    public Object get(int index) {
        return this.list.get(index);
    }
}
