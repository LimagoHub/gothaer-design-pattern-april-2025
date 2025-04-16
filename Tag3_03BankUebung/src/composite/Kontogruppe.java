package composite;

import composite.visitor.BankVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kontogruppe extends AbstractKontoNode {

    private List<AbstractKontoNode> children = new ArrayList<AbstractKontoNode>();

    public Kontogruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractKontoNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractKontoNode child) {
        child.setParent(this);
        children.add(child);
    }
    public void removeChild(final AbstractKontoNode child) {
        child.setParent(null);
        children.remove(child);
    }

    @Override
    public void accept(final BankVisitor visitor) {
        visitor.visit(this);
    }
}
