interface big {
    void add(int a, int b);
}

interface small extends big {
    void sub(int a, int b);
}

public class Inheritinterface implements small {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        small obj = new Inheritinterface();
        obj.add(5, 7);
        obj.sub(80, 5);
    }
}
