package main;

import processor.AbstractFileProcessor;
import processor.CharacterCounter;
import processor.FileCopy;
import processor.LineCounter;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {

        AbstractFileProcessor fileProcessor = new FileCopy();
        fileProcessor.run("./src/resources/eingabe.txt");
    }
}