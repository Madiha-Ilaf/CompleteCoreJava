public class Missing {
    public void missing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Missing element is: " + (i + 1));
                return;
            }
        }
        System.out.println("No missing element");
    }

    public static void main(String[] args) {
        Missing miss = new Missing();
        int[] arr = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        miss.missing(arr);
    }
}
