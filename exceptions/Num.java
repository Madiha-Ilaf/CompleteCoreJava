public class Num {
    public static void main(String[] args) {
        String str = "a11";
        try {
            int x = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
