import java.io.FileWriter;
import java.io.BufferedWriter;

public class Bufferedwriter {
    public static void main(String[] args) {
        String data = "Buffered writer";
        try {
            FileWriter fw = new FileWriter("br.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}