public class Equalnotequal {
    public static void main(String args[]) {
        int c = 0;
        int a = 0;
        int b = 10;
        while (c < 10) {
            if (a == b)
                System.out.println("Equal");
            else
                System.out.println("Not equal");
            a++;
            b--;
            c++;
        }
    }
}
