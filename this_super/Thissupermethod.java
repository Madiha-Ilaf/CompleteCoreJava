class A {
    public void good() {
        System.out.println("Hope u r good");
        this.bad();
    }

    public void bad() {
        System.out.println("Bad");
    }
}

public class Thissupermethod extends A {
    public void hello() {
        super.good();
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

    }
}
