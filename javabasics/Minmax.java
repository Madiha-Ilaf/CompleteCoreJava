public class Minmax {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min value:" + min);
        System.out.println("max value:" + max);
    }
}
