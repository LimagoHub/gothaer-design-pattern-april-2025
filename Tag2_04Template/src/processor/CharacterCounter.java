package processor;

public class CharacterCounter extends AbstractCounter {

    @Override
    public void process(final char c) {
        incrementCounter();
    }
}
