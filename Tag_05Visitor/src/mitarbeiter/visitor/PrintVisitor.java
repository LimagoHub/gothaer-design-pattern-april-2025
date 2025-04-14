package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class PrintVisitor implements MitarbeiterVisitor {

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        System.out.println(lohnEmpfaenger);
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        System.out.println(gehaltsEmpfaenger);
    }
}
