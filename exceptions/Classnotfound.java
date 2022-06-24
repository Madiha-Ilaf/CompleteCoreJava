import java.lang.ClassNotFoundException;

public class Classnotfound {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("java_folder.exceptions.ws");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
