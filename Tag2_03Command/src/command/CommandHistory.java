package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory
{

    private final Deque<Command> undoDequeue  = new ArrayDeque<>();
    private final Deque<Command> redoDequeue  = new ArrayDeque<>();

    public void addCommand(Command command) {
        if(! command.isUndoable()) return;
        redoDequeue.clear();
        undoDequeue.push(command);
    }

    public void undo() {
        if(undoDequeue .isEmpty()) {
            System.out.println("can not undo");
        } else {
            Command command = undoDequeue.pop();
            command.undo();
            redoDequeue.push(command);

        }
    }

    public void redo() {
        if(redoDequeue .isEmpty()) {
            System.out.println("can not redo");
        } else {
            Command command = redoDequeue.pop();
            command.execute();
            undoDequeue.push(command);

        }
    }
}
