import java.io.InputStream;
import java.io.FileInputStream;

public class Inputstream {
    public static void main(String[] args) {
        try {
            InputStream f = new FileInputStream("hello.txt");
            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}