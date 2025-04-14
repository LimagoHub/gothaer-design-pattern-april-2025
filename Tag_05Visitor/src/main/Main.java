package main;

import firma.Firma;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;
import mitarbeiter.visitor.PrintVisitor;
import mitarbeiter.visitor.StatistikVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();
        firma.addMitarbeiter(new GehaltsEmpfaenger("Schmitt",2000));
        firma.addMitarbeiter(new GehaltsEmpfaenger("Meier",1500));
        firma.addMitarbeiter(new LohnEmpfaenger("Hinz",40, 15));
        firma.addMitarbeiter(new LohnEmpfaenger("Kunz",36, 12));
        firma.addMitarbeiter(new GehaltsEmpfaenger("Schulz",5000));

        //firma.print();
        firma.iterate(new PrintVisitor());

        firma.iterate(new StatistikVisitor());


    }
}