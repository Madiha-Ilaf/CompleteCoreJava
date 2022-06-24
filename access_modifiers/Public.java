class A {
    int a = 10;

    public void display() {
        System.out.println("Hello!");
    }
}

public class Public extends A {
    public static void main(String[] args) {
        Public os = new Public();
        os.display();
        System.out.println(os.a);
    }
}
