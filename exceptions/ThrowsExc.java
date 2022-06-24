public class ThrowsExc {
    public void exc() {
        throw new RuntimeException("Throwing an exception");
    }

    public static void main(String[] args) {
        ThrowsExc obj = new ThrowsExc();
        obj.exc();
    }
}
