abstract class A {
    abstract void add(int a, int b);

    void sub(int a, int b) {
        System.out.println(a - b);
    }
}

public class Childabs extends A {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Childabs obj = new Childabs();
        obj.add(1, 2);
    }
}
