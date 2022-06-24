interface inter {
    void add(int a, int b);
}

public class Interface implements inter {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.add(2, 3);
    }

}
