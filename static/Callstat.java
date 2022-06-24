public class Callstat {
    public static void stat() {
        System.out.println("hello world");
    }

    public void inst() {
        stat();
    }

    public static void main(String[] args) {
        Callstat obj = new Callstat();
        obj.inst();
    }

}
