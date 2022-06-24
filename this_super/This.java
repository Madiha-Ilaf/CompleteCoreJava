public class This {
    int a = 10;
    int b = 20;

    public void prints() {
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        This obj = new This();
        obj.prints();
    }
}
