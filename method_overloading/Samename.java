public class Samename {
    public void man(int a, int b) {
        System.out.println(a + b);
    }

    public void man(String a, String b) {
        System.out.println("HI " + a + " " + b);
    }

    public static void main(String[] args) {
        Samename obj = new Samename();
        obj.man(4, 5);
        obj.man("Sunil", "Sharma");
    }
}
