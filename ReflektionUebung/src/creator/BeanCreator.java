package creator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanCreator {

    private static final String PREFIX = "set";
    public Object createAndPopulateBean(final String fqn) {
        try (final Scanner scanner = new Scanner(System.in)){

            final Object object = Class.forName(fqn).getConstructor().newInstance();
            Method[] methods = object.getClass().getMethods();
            for (Method method : methods) {
                if (method.getName().startsWith(PREFIX)) {
                    System.out.print("Bitte Wert fuer " + method.getName().substring(PREFIX.length()) + " eingeben: ");
                    method.invoke(object, scanner.nextLine());
                }
            }

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
