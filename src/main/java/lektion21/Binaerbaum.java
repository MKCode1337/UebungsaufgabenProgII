package lektion21;

class Binaerbaum<E extends Comparable<E>> {
    Element<E> root;

    class Element<E> {
        E value;
        Element<E> left;
        Element<E> right;

        public Element(E value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();
        toStringRekursiv(root, ausgabe);
        return ausgabe.toString();
    }

    public void fuegeHinzu(E element)
    {
        Element<E> eingabe = new Element<E>(element);
        if (root == null) root = eingabe;
        else {
            fuegeHinzuRekursiv(root, eingabe);
        }
    }

    public  void fuegeHinzuRekursiv(Element<E> current,Element<E> neu){
        int cmp = neu.value.compareTo(current.value);

        if (cmp < 0) {
            if (current.left == null) {
                current.left = neu;
            }
            else fuegeHinzuRekursiv(current.left, neu);
        }
        else {
            if (current.right == null) {
                current.right = neu;
            }
            else fuegeHinzuRekursiv(current.right, neu);
        }
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

    public void toStringRekursiv(Element<E> current, StringBuilder sb){
        if (current == null) return;
        ausgebenRekursiv(current.left);
        sb.append(current.value);
        sb.append(" ");
        ausgebenRekursiv(current.right);
    }
}
