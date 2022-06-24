import java.util.*;

public class Findindex {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        int index = -1;
        System.out.println("Enter element whose index you want: ");
        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(elem + " Not found");
        } else {
            System.out.println(elem + " found at " + index + " position");
        }
    }
}
