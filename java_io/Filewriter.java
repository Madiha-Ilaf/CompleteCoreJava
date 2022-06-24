import java.io.FileWriter;

public class Filewriter {
    public static void main(String[] args) {
        String data = "hello file writer";
        try {
            FileWriter fw = new FileWriter("fr.txt");
            fw.write(data);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}