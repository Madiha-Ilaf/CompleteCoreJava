class A {
    int A(int a) {
        return a;
    }
}

public class Returntype extends A {
    String Returntype() {
        return "hello";
    }

    public static void main(String[] args) {
        A obj1 = new A();
        Returntype obj2 = new Returntype();
        System.out.println(obj2.Returntype());
        System.out.println(obj1.A(3));
    }

}
