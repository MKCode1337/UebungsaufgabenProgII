package lektion21;

public class Binärbaum<E> {
    Element<E> root;
    public class Element<E> {
        Element<E> left;
        Element<E> right;
    }

    public void einfuegen(Element<E> element)
    {
        if (root == null) root = element;
        else {
            einfuegenRekursiv(root, element);
        }
    }

    public  void einfuegenRekursiv(Element<E> current,Element<E> neu){
        if (current.left == null) {current.left = neu;}
        if (current.right == null) {current.right = neu;}
        else einfuegenRekursiv(current.left, neu);
    }

    public void ausgeben()
    {
        if (root == null) return;
        else {
            ausgebenRekursiv(root);
        }
    }

    public void ausgebenRekursiv(Element<E> current){
        if (current == null) return;
        ausgebenRekursiv(current.left);
        System.out.println(current);
        ausgebenRekursiv(current.right);
    }
}
