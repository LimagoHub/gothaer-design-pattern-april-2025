package main;

import command.Command;
import command.CommandFactory;
import command.CommandHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        CommandHistory history = new CommandHistory();
        while(true) {
            System.out.print("#>");
            String zeile = sc.nextLine();

            if(zeile.equals("ende")) break;

            if(zeile.equals("undo")) {
                history.undo();
                continue;
            }
            if(zeile.equals("redo")) {
                history.redo();
                continue;
            }


            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();
        }
    }
}