interface intr {
    // private int a = 10; // cant be private or protected, they are public static
    // and final by default.
    // protected int b = 20;
    public int c = 30;
}

public class PriProPubFie implements intr {
    public static void main(String[] args) {
        System.out.println(c);
    }
}
