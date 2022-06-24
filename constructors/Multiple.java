public class Multiple {
    Multiple() {
        System.out.println("WOW!");
    }

    public static void main(String[] args) {
        Multiple obj = new Multiple();
        Multiple obj1 = new Multiple();
        Multiple obj2 = new Multiple();
        obj1 = obj;
        obj2 = obj;
    }
}
