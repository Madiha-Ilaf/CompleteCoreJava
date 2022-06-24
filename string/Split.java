public class Split {
    public static void main(String[] args) {
        String str = new String("You are different are some people are ! hehehehehe!!");
        String str1[] = str.split("are", 3);
        for (String a : str1) {
            System.out.println(a);
        }
    }
}
