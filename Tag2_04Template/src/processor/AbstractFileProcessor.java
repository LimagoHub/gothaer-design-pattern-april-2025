package processor;
import java.io.BufferedReader;
import java.io.FileReader;

public abstract class AbstractFileProcessor {

    public final void run(String fileName) {

        try(final BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            init();

            int ch;
            while ((ch = bufferedReader.read()) != -1) {
               process((char) ch);
            }

            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void init(){

    }

    public abstract void process(char c) ;

    public void dispose(){

    }
}
