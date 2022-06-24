import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Bufferedoutput {
    public static void main(String[] args) {
        String s = "Academy";
        try {
            FileOutputStream f = new FileOutputStream("bf.txt");
            BufferedOutputStream bf = new BufferedOutputStream(f);
            byte[] b = s.getBytes();
            bf.write(b);
            bf.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
