package state;

public class AbstractState implements State {

    private final Front front;

    public AbstractState(final Front front) {
        this.front = front;
    }

    public Front getFront() {
        return front;
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Diese methode macht in diesem Zusatnd keinen Sinn");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese methode macht in diesem Zusatnd keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese methode macht in diesem Zusatnd keinen Sinn");
    }
}
