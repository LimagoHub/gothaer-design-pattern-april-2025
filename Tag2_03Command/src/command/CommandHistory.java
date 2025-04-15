package command;

public class CommandHistory
{
    public void addCommand(Command command) {
        if(! command.isUndoable()) return;
        // .. Verhaltem implementieren
    }

    public void undo() {
        System.out.println("can not undo");
    }

    public void redo() {
        System.out.println("can not redo");
    }
}
