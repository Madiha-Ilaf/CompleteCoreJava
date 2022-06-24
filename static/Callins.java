public class Callins {
    public void inst() {
        System.out.println("Hello world");
    }

    public static void stat(Callins obj) {
        obj.inst();
    }

    public static void main(String[] args) {
        Callins obj = new Callins();
        stat(obj);
    }

}
