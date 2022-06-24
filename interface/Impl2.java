interface inter1 {
    void add(int a, int b);
}

interface inter2 {
    void sub(int a, int b);
}

public class Impl2 implements inter1, inter2 {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Impl2 obj = new Impl2();
        obj.add(2, 3);
        obj.sub(3, 2);
    }

}
