import java.lang.ArithmeticException;

public class Arthtrycatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
