package singlton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {

        return instance;
    }

    private Singleton() {
    }

    public void log(String message) {
        System.out.println(message);
    }
}
