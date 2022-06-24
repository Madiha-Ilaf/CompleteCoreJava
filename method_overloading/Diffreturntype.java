public class Diffreturntype {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    /*
     * public int add(int a,int b){ //cant overload a method with different return
     * types
     * System.out.println(a+b);
     * }
     */
    public static void main(String[] args) {
        Diffreturntype obj = new Diffreturntype();
        obj.add(1, 2);
    }
}
