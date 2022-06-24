public class Constr {
    Constr() {
        System.out.println("This is a default constructor");
    }

    Constr(String a) {
        System.out.println("This is a " + a + " argument constructor");
    }

    Constr(String a, String b) {
        System.out.println("This is " + a + " " + b + " argument constructor");
    }

    public static void main(String[] args) {
        Constr obj = new Constr();
        Constr obj2 = new Constr("one");
        Constr obj3 = new Constr("a", "two");
    }
}
