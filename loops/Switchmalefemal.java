import java.util.*;

public class Switchmalefemal {
    public static void main(String args[]) {
        System.out.println("Enter gender: (M or F) ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "M":
                System.out.println("Male person");
                break;
            case "F":
                System.out.println("Female person");
                break;
        }
    }

}
