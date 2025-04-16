package processor;

public class LineCounter extends AbstractCounter {



    @Override
    public void process(final char c) {
        if(c == '\n') {
            incrementCounter();
        }
    }


}
