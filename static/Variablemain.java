public class Variablemain {
    static int a = 10;
    int b = 20;

    public int inst() {
        return b;
    }

    public static void main(String[] args) {
        Variablemain obj = new Variablemain();
        System.out.println("This is instance variable: " + obj.inst());
        System.out.println("This is static variable: " + a);
    }
}
