package composite.visitor;

import composite.Konto;
import composite.Kontogruppe;

public interface BankVisitor {

    void init();
    void dispose();
    void visit(Konto konto);
    void visit(Kontogruppe kontogruppe );
}
