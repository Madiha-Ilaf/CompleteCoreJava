public class Length {
    public static void main(String[] args) {
        String str = "Hello world";
        int i = 0;
        for (char c : str.toCharArray()) {
            i++;
        }
        System.out.println("Length is: " + i);
    }
}
