import java.io.OutputStream;
import java.io.FileOutputStream;

public class Outputstream {
    public static void main(String[] args) {
        String data = " world!";
        try {
            OutputStream f = new FileOutputStream("hello.txt");
            byte[] b = data.getBytes();
            f.write(b);
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
