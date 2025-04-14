package main;

import singlton.Singleton;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger("Main");
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println("Hello, World!");
    }
}