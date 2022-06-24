public class Diffparam {
    public void display(int a, String b) {
        System.out.println("There are " + a + " " + b);
    }

    public void display(double a, String b) {
        System.out.println("There are " + a + " " + b);
    }

    public static void main(String[] args) {
        Diffparam obj = new Diffparam();
        obj.display(5.5, "lts of water");
        obj.display(5, "dogs");
    }
}
