import java.io.FileReader;
import java.io.BufferedReader;

public class Bufferedreader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("br.txt");
            BufferedReader bf = new BufferedReader(fr);
            int i;
            while ((i = bf.read()) != -1) {
                System.out.print((char) i);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
