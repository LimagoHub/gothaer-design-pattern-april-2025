package command;

import math.Calculator;

public class ClearCommand extends AbstractCommand{
    private double value;

    @Override
    public void execute() {
        Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemory(value);
    }

    @Override
    public boolean isUndoable() {
        return true;
    }
}
