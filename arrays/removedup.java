import java.util.Arrays;

public class removedup {
    public static void duprem(int[] arr) {
        int c = 0;
        Arrays.sort(arr);
        int j = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
                c++;
            }
        }
        temp[j++] = arr[arr.length - 1];
        for (int i = 0; i < temp.length - c + 1; i++) {
            System.out.println(temp[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 6, 8, 1, 1, 2, 4, 2 };
        duprem(arr);
    }
}
