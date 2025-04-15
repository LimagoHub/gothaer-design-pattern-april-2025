package command;

import java.lang.reflect.InvocationTargetException;

public class CommandFactory {

    private static final String PREFIX = "command.";
    private static final String SUFFIX = "Command";


    public static Command create(String zeile) {
        try {
            String [] tokens = zeile.split(" ");
            Command command = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX)
                    .getConstructor()
                    .newInstance();
            command.parse(tokens);
            return command;
        } catch (Throwable e) {
            System.out.println("Unbekannter Befehl: " + zeile);
            return null;
        }
    }
}
