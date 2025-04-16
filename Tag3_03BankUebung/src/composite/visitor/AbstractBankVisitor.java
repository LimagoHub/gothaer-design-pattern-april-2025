package composite.visitor;

import composite.Konto;
import composite.Kontogruppe;

public abstract class AbstractBankVisitor implements BankVisitor {
    @Override
    public void init() {
        // NOP
    }

    @Override
    public void dispose() {
        // NOP
    }

    @Override
    public void visit(final Konto konto) {
        // NOP
    }

    @Override
    public void visit(final Kontogruppe kontogruppe) {
        // NOP
    }
}
