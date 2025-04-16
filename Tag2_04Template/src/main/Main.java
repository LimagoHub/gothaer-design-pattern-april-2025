package main;

import processor.CharacterCounter;
import processor.FileProcessor;
import processor.FileCopy;
import processor.LineCounter;

public class Main {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.addCharacterHandler(new CharacterCounter());
        fileProcessor.addCharacterHandler(new LineCounter());
        fileProcessor.run("./src/resources/eingabe.txt");
    }
}