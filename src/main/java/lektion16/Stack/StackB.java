package lektion16.Stack;

import java.util.ArrayList;

public class StackB {
    ArrayList list = new ArrayList();

    public void push(Object obj) {
        this.list.add(obj);
    }
    public Object pop() {
        return this.list.remove(this.list.size() - 1);
    }
}
