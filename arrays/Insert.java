public class Insert {
    public void insert(int elem, int pos) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            brr[i] = arr[i];
        }
        brr[pos] = elem;
        for (int i = pos + 1; i < brr.length; i++) {
            brr[i] = arr[i - 1];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }

    public static void main(String[] args) {
        Insert obj = new Insert();
        obj.insert(5, 2);
    }
}
