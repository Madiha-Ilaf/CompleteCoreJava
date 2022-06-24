public class Countofevenodd {
    public static void count(int[] arr) {
        int n = arr.length;
        int count_even = 0;
        int count_odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }
        System.out.println("Number of even numbers: " + count_even);
        System.out.println("Number of odd numbers: " + count_odd);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        count(arr);
    }
}
