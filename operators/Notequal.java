import java.util.*;

public class Notequal {
    public void equalornot(int a, int b) {
        if (a == b)
            System.out.println("The numbers are equal");
        else
            System.out.println("Numbers are not equal");
    }

    public static void main(String args[]) {
        Notequal ne = new Notequal();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ne.equalornot(a, b);

    }

}
