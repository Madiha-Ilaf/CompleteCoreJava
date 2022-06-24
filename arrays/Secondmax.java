public class Secondmax {
    public void secondmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                if (arr[i] > sec_max) {
                    sec_max = arr[i];
                }
            }
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                sec_max = temp;
            }
        }
        System.out.println("Second max elem is: " + sec_max);
    }

    public static void main(String[] args) {
        Secondmax obj = new Secondmax();
        int[] arr = new int[] { 1, 2, 3, 5, 5 };
        obj.secondmax(arr);
    }
}
