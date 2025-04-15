package command;

public class CommandFactory {

    public static Command create(String zeile) {
        String [] tokens = zeile.split(" ");
        Command command = null;
        if(tokens[0].equals("Add")) {
            command = new AddCommand() ;
            command.parse(tokens);
        }
        if(tokens[0].equals("Print")) {
            command = new PrintCommand() ;
            command.parse(tokens);
        }
        return command;
    }
}
