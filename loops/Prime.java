public class Prime {
    public static void primenum(int a) {
        int f = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                f++;
            }
        }
        if (f == 2) {
            System.out.println("prime");
        } else
            System.out.println("not prime");
    }

    public static void main(String args[]) {
        primenum(5);
        primenum(25);
    }

}
