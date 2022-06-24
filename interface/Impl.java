interface inter {
    void add(int a, int b);
}

public class Impl implements inter {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        inter obj = new Impl();
        obj.add(2, 3);
    }

}
