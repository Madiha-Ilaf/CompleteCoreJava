import java.util.*;

public class Checkelem {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println("Enter element whose index you want: ");
        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
