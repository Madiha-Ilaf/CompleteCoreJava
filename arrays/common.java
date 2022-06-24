public class common {
    public void cmnarr(int[] arr, int[] brr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    System.out.println("common element is" + arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        common obj = new common();
        int[] arr = new int[] { 1, 2, 3, 4 };
        int[] brr = new int[] { 1, 3, 5, 7 };
        obj.cmnarr(arr, brr);
    }

}
