class A {
    int x = 15;

    public void display() {
        System.out.println("This is super's super class");
    }

    public void modulo(int a, int b) {
        System.out.println("Modulo: " + (a % b));
    }

    public void greater(int a, int b) {
        System.out.println("Greater: " + ((a > b) ? a : b));
    }
}

class B extends A {
    public void display() {
        System.out.println("This is super class");
    }

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

class C extends B {
    public void display() {
        System.out.println("This is base class");
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.display();
        obj1.modulo(10, 3);
        obj1.greater(10, 3);
        obj2.display();
        obj2.add(10, 3);
        obj2.sub(10, 3);
        obj3.display();
        obj3.mul(10, 3);
        obj3.div(10, 3);
        A o1 = new B();
        A o2 = new C();
        o1.display();
        o2.display();
        System.out.println(o1.x); // runtime polymorphism for data members
        System.out.println(o2.x); // runtime polymorphism for data members
    }
}
