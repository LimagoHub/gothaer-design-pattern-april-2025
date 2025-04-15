package main;

import command.Command;
import command.CommandFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("#>");
            String zeile = sc.nextLine();

            if(zeile.equals("ende")) break;

            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();
        }
    }
}