class A {
    int a = 10;
    int b = 20;

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class Def {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.add(12, 3);
    }
}
