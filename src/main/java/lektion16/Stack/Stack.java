package lektion16.Stack;

import java.util.ArrayList;

public class Stack extends ArrayList {
    //Nachteil: alle Methoden von ArrayList werden IMMER mit vererbt
    public void push(Object obj) {
            this.add(obj);
        }public Object pop() {
        return this.remove(this.size() - 1);
    }
    public static void main(String[] args) {
            Stack stack = new Stack();
        }
}
