package composite.visitor;

import composite.Konto;
import composite.Kontogruppe;

public class PrintVisitor extends AbstractBankVisitor{

    @Override
    public void visit(final Konto konto) {
        System.out.println(konto);
    }

    @Override
    public void visit(final Kontogruppe kontogruppe) {
        System.out.println(kontogruppe);
    }
}
