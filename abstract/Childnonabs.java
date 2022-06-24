abstract class A {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class Childnonabs extends A {
    public static void main(String[] args) {
        Childabs obj = new Childabs();
        obj.add(3, 4);
    }

}
