interface inter2 {
    void add(int a, int b);

    void sub(int a, int b);
}

public class Interface2 {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.add(1, 3);
    }
}
