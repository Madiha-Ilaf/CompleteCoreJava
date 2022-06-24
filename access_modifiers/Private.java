public class Private {
    private int a = 10;
    private int b = 20;

    private void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Private pr = new Private();
        System.out.println(pr.a);
        System.out.println(pr.b);
        pr.add(12, 3);
    }
}

class Sub extends Private {
    public void sub() {
        // System.out.println(a - b);
        // cannot refer to a private variable and private method from sub class
    }
}
