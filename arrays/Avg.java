public class Avg {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 2, 3 };
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / (arr.length);
        System.out.println("Avg is: " + avg);
    }
}
