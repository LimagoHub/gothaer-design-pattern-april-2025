package state;

public class StateA extends AbstractState {
    public StateA(final Front front) {
        super(front);
    }

    @Override
    public void print() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
        getFront().current = getFront().stateB;
    }
}
