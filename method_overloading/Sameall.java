public class Sameall {
    public void man(int a, int b) {
        System.out.println(a + b);
    }

    /*
     * public void man(int a, int b) {
     * System.out.println("HI " + a + " " + b); //Cannot have same no of parameters,
     * same name
     * //and same return type of parameters
     * }
     */

    public static void main(String[] args) {
        Sameall obj = new Sameall();
        obj.man(4, 5);
    }
}
