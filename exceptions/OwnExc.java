class voteExc extends Exception {
    voteExc() {
        System.out.println("Cant vote");
    }
}

public class OwnExc {
    public static void main(String[] args) throws voteExc {
        int age = 16;
        try {
            if (age < 18) {
                throw new voteExc();
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
