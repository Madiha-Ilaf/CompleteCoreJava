import java.io.FileInputStream;
import java.util.Properties;

public class Readprop {
    public static void main(String[] args) {
        Properties prop = readPropertiesFile("pf.txt");
        System.out.println("College: " + prop.getProperty("College"));
        System.out.println("Branch: " + prop.getProperty("Branch"));
    }

    public static Properties readPropertiesFile(String fileName) {
        Properties prop = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
