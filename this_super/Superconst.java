class A {
    A() {
        System.out.println("Yo!");
    }
}

public class Superconst extends A {
    Superconst() {
        super();
    }

    public static void main(String[] args) {
        Superconst obj = new Superconst();
    }
}
