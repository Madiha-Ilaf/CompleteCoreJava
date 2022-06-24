import java.lang.reflect.Method;

public class NoSuchmethod {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("NoSuchmethod");
            Method m = c.getDeclaredMethod("add", int.class);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}