class A {
    protected interface intr {
        public final static int num = 11;

        public void mad();
    }

}

public class Privateintr implements intr {
    public void mad() {
        System.out.println("No one is mad");
    }

    public static void main(String[] args) {
        Privateintr obj = new Privateintr();
        obj.mad();
        // System.out.println(num);
    }
}
