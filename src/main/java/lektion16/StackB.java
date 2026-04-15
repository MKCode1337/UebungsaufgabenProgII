package lektion16;

import java.util.ArrayList;

public class StackB {
    ArrayList list = new ArrayList();

    public void push(Object obj) {
        this.list.add(obj);
    }
    public void pop() {
        System.out.println(this.list.get(this.list.size() - 1));
        this.list.remove(this.list.size() - 1);
    }
}
