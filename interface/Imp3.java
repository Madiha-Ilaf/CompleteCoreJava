interface inter1 {
    void display();
}

interface inter2 {
    void display();
}

public class Imp3 implements inter1, inter2 {
    public void display() {
        System.out.print("Hello ");
    }

    public static void main(String[] args) {
        inter1 obj = new Imp3();
        inter2 obj2 = new Imp3();
        obj.display();
        obj2.display();
    }

}
