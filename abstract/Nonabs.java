abstract class A {
    public abstract void add(int a, int b);

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class B extends A {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

public class Nonabs {
    public static void main(String[] args) {
        B obj = new B();
        obj.sub(4, 3);
    }
}
