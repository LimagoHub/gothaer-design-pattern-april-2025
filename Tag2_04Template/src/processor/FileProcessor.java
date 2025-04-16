package processor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public  class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<CharacterHandler>();
    public void addCharacterHandler(CharacterHandler handler) {
        handlers.add(handler);
    }

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

    private void init(){
        handlers.forEach(CharacterHandler::init);

    }

    private  void process(char c) {
        handlers.forEach(handler -> handler.process(c));
    }

    private void dispose(){
        handlers.forEach(CharacterHandler::dispose);
    }
}
