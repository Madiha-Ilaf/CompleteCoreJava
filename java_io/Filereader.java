import java.io.FileReader;

public class Filereader {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("fr.txt");
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
