package main;

import java.util.Iterator;
import java.util.List;

/*
    Customer[] customers = getAllCustomers();
    List<Customer> customers = getAllCustomers();
    Iterator<Customer> customers = getAllCustomers();


 */


public class Main {
    public static void main(String[] args) {

        var liste = List.of("Eins","Zwei","Drei","Frei");

        for (var i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
        System.out.println("-".repeat(30));
        for(var item: liste) {
            System.out.println(item);
        }
        System.out.println("-".repeat(30));
        liste.forEach(System.out::println);

        System.out.println("-".repeat(30));
        Iterator<String> iterator = liste.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}