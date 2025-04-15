package processor;

public class CharacterCounter extends AbstractFileProcessor{

    private int counter = 0;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.println(counter);
    }

    @Override
    public void process(final char c) {
        counter++;
    }
}
