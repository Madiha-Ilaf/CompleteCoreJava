interface A {
    static final int a = 10;
}

public class StaticFinal implements A {
    public static void main(String[] args) {
        System.out.println(a);
    }
}
