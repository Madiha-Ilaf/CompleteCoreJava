public class Palindrome {
    public void paln(int n) {
        int s = 0;
        int a = n;
        while (n != 0) {
            int m = n % 10;
            s = s * 10 + m;
            n = n / 10;
        }
        if (a == s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String args[]) {
        Palindrome p = new Palindrome();
        p.paln(121);
    }
}
