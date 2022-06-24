interface intr { // By default every interface is public.
    int num = 11;

    public void mad();
}

public class Pubintr implements intr {
    public void mad() {
        System.out.println("No one is mad");
    }

    public static void main(String[] args) {
        Pubintr obj = new Pubintr();
        obj.mad();
        System.out.println(num);
    }
}
