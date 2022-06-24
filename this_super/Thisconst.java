public class Thisconst {
    int a;
    int b;

    Thisconst() {
        this(2, 3);
    }

    Thisconst(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Thisconst obj = new Thisconst();
    }
}
