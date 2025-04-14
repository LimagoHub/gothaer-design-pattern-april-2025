package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        // Ok
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        // Nop
    }

    @Override
    public void init() {
        // Nop
    }

    @Override
    public void dispose() {
        // Nop
    }
}
