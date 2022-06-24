public class Globallocal {
    static int a = 10;
    static int b = 5;

    public static void printa() {
        a = 5;
        b = 7;
        System.out.println("Local sum :" + (a + b));
    }

    public static void main(String args[]) {
        System.out.println("Global sum : " + (a + b));
        printa();
    }
}
