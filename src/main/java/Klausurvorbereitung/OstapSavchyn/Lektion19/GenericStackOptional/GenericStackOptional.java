package Klausurvorbereitung.OstapSavchyn.Lektion19.GenericStackOptional;

import java.util.ArrayList;
import java.util.Optional;

public class GenericStackOptional<E> {
    private ArrayList<E> elemente = new ArrayList<>();

    public void push(E element) {
        elemente.add(element);
    }
    public Optional<E> pop() {
        if (elemente.isEmpty()) return Optional.empty();
        return Optional.of(elemente.removeLast());
    }
    public E get(int index) {
        return elemente.get(index);
    }

    public static void main(String[] args) {
        GenericStackOptional<String> s = new GenericStackOptional<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}