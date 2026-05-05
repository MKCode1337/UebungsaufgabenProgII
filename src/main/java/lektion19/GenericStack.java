package lektion19;

import java.util.ArrayList;

public class GenericStack<E> {
    ArrayList<E> list = new ArrayList<>();

    public void push(E element) {
        this.list.add(element);
    }
    public E pop() {
        if (this.list.isEmpty()) throw new RuntimeException("Der Stack ist leer.");
       return this.list.remove(this.list.size() - 1);
    }
    public E get(int index) {
        return this.list.get(index);
    }

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
