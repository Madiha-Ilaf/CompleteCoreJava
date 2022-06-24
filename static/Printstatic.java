public class Printstatic {
    static int a = 12;
    static int b = 2;

    public void mul() {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Printstatic obj = new Printstatic();
        obj.mul();
    }
}
