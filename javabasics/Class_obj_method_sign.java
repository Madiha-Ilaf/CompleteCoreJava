public class Class_obj_method_sign {// class
    public int multiply(int a, int b) {// method
        int c = a * b;
        return c;
    }

    public static void main(String args[]) {
        Class_obj_method_sign coms = new Class_obj_method_sign();// object
        int result = coms.multiply(2, 3); // method signature
        System.out.println(result);
    }
}