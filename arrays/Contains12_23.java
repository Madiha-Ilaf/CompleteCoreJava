public class Contains12_23 {
    public void contains(int[] arr, int a, int b) {
        int c0 = 0;
        int c1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                c0 = 1;
            }
            if (arr[i] == b) {
                c1 = 1;
            }
        }
        if (c0 == 1 && c1 == 1) {
            System.out.println(a + "," + b + " are in the array");
        } else {
            System.out.println(a + "," + b + " are not in the array");
        }
    }

    public static void main(String[] args) {
        Contains12_23 c = new Contains12_23();
        int[] arr = new int[] { 1, 12, 23, 43, 21 };
        c.contains(arr, 12, 23);
        int[] brr = new int[] { 1, 2, 23, 234 };
        c.contains(brr, 12, 23);
    }
}
