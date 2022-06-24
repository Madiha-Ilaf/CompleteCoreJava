import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Multicatch {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = new int[] { 1, 2, 3, 4 };
        try {
            int c = a / 2;
            System.out.println(c);
            System.out.println(arr[4]);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("Index out of bounds");
        }
    }
}
