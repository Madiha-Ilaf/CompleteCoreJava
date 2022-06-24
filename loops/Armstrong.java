public class Armstrong {
    public void isArmstrong(int a) {
        int sum = 0;
        int b = a;
        while (b != 0) {
            int n = b % 10;
            sum = sum + (n * n * n);
            b = b / 10;
        }
        if (sum == a) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String args[]) {
        Armstrong ar = new Armstrong();
        ar.isArmstrong(153);
        ar.isArmstrong(145);
    }

}
