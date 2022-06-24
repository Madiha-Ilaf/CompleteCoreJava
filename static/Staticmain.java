public class Staticmain {
    public static int stat() {
        int a = 10;
        return a;
    }

    public int inst() {
        int b = 20;
        return b;
    }

    public static void main(String[] args) {
        Variablemain obj = new Variablemain();
        System.out.println("This is instance method call: " + obj.inst());
        System.out.println("This is static method call: " + stat());
    }
}
