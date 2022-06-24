public class Switchevenodd {
    public static void main(String args[]) {
        int a = 10;
        int choice = 0;
        if (a % 2 == 0) {
            choice = 1;
        }
        switch (choice) {
            case 0:
                System.out.println("Odd number");
                break;
            case 1:
                System.out.println("Even number");
                break;
        }
    }
}
