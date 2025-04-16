package processor;

public abstract class AbstractCounter implements CharacterHandler{

    private int counter = 0;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.println(this.getClass().getSimpleName() + ": " + counter);
    }

    protected void incrementCounter() {
        counter++;
    }

    protected int getCounter() {
        return counter;
    }
}
