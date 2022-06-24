public class Stringindex {
    public static void main(String[] args) {
        String str = "hello";
        try {
            char c = str.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
