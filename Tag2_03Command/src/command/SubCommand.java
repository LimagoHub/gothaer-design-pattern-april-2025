package command;

import math.Calculator;

public class SubCommand implements Command {

    private double value;
    @Override
    public void parse(final String[] tokens) {
        value = Double.parseDouble(tokens[1]);
    }

    @Override
    public void execute() {
        Calculator.getInstance().sub(value);
    }

    @Override
    public void undo() {
        Calculator.getInstance().add(value);
    }

    @Override
    public boolean isUndoable() {
        return true;
    }
}
