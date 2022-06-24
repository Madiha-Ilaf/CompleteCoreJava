import java.lang.ArrayIndexOutOfBoundsException;

public class Arrayindex {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2 };
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught");
            e.printStackTrace();
        }
    }

}
