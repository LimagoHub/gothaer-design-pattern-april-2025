package mitarbeiter.visitor;

import mitarbeiter.LohnEmpfaenger;

public class ResetArbeitsZeitVisitor extends AbstractMitarbeiterVisitor {

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        lohnEmpfaenger.setArbeitszeit(0);
    }
}
