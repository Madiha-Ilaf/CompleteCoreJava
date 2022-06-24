public class Printinstance {
    int a = 12;
    int b = 2;

    public static void mul(Printinstance obj) {
        System.out.println(obj.a * obj.b);
    }

    public static void main(String[] args) {
        Printinstance obj = new Printinstance();
        mul(obj);
    }

}
