class A {
    int a = 10;
}

public class Super extends A {
    public void prints() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Super obj = new Super();
        obj.prints();
    }
}
