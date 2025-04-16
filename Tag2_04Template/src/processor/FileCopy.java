package processor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements CharacterHandler {

    private FileWriter fileWriter;

    @Override
    public void init() {
        try {

            fileWriter = new FileWriter("./src/resources/ausgabe.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void process(final char c) {
        try {
            fileWriter.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dispose() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
