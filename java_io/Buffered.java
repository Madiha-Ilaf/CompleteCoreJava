import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffered {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("bf.txt");
            BufferedInputStream b = new BufferedInputStream(f);
            int i;
            while (((i = b.read()) != -1)) {
                System.out.print((char) i);
            }
            b.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
