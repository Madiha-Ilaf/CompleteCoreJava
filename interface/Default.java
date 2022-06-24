interface ert {
    default void display() {
        System.out.println("Hello dog");
    }
}

public class Default implements ert {
    public static void main(String[] args) {
        ert obj = new Default();
        obj.display();
    }
}
