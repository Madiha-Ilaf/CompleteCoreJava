public class Copy {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(brr[i]);
        }
    }

}
