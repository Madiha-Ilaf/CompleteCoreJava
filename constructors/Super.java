class A1 {
    A1() {
        System.out.println("Hello");
    }

    A1(int a) {
        System.out.println(a);
    }

}

public class Super extends A1 {
    Super() {
        super();
    }

    Super(int a) {
        super(a);
    }

    public static void main(String[] args) {
        Super obj1 = new Super();
        Super obj2 = new Super(5);
    }
}
