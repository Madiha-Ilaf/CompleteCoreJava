import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfound {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("/asr/dsa/tdes")));
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
    }

}
