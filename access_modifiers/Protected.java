class A {
    protected int a = 10;

    protected void display() {
        System.out.println("Hello!");
    }
}

class Protected extends A {
    public static void main(String[] args) {
        A obj = new Protected();
        System.out.println(obj.a);
        obj.display();
    }
}