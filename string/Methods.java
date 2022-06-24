public class Methods {
    public static void main(String[] args) {
        String str = new String("You are different from some people! hehehehehe!!");
        String str1 = new String("YOu are different from some people! hehehehehe!!");
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.startsWith("you"));
        System.out.println(str.endsWith("!!"));
        System.out.println(str.compareTo(str1));
    }

}
