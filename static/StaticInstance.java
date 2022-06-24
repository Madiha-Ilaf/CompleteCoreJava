public class StaticInstance {
    public static int a = 40;
    public static int b = 20;
    int x = 10;
    int c = 12;

    public void add() {
        System.out.println(x + b);
    }

    public void sub() {
        System.out.println(c - b);
    }

    public static void addstatic() {
        System.out.println(a + b);
    }

    public static void substatic() {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        StaticInstance si = new StaticInstance();
        si.add();
        si.sub();
        addstatic();
        substatic();
    }
}
