package lektion16;

import java.util.ArrayList;

public class Stack extends ArrayList {

        public void push(Object obj) {
            this.add(obj);
        }
        public void pop() {
            System.out.println(this.get(this.size() - 1));
            this.remove(this.size() - 1);
        }
}
