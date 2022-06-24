public class Diffmeth {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Diffmeth obj = new Diffmeth();
        obj.add(2, 3);
        obj.add(2, 3, 5);
    }
}
