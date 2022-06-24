public class Pubpriprodef {
    public Pubpriprodef(int a) {
        System.out.println(a);
    }

    private Pubpriprodef(int a, int b) {
        System.out.println(a + b);
    }

    protected Pubpriprodef() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Pubpriprodef rep = new Pubpriprodef();
        Pubpriprodef rep1 = new Pubpriprodef(3, 4);
        Pubpriprodef rep2 = new Pubpriprodef(6);

    }
}
