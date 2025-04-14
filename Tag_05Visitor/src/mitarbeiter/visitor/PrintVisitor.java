package mitarbeiter.visitor;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor {

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        System.out.println(lohnEmpfaenger);
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        System.out.println(gehaltsEmpfaenger);
    }
}
