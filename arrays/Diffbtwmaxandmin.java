public class Diffbtwmaxandmin {
    public int diff(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (max - min);
    }

    public static void main(String args[]) {
        Diffbtwmaxandmin dmm = new Diffbtwmaxandmin();
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println("Difference between max and min elem is: " + dmm.diff(arr));
    }
}
