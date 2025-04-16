package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKontoNode implements Iterable<AbstractKontoNode> {

    private AbstractKontoNode parent = null;
    private String label;

    public AbstractKontoNode(final String label) {
        this.label = label;
    }

    public AbstractKontoNode getParent() {
        return parent;
    }

    public void setParent(final AbstractKontoNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractKontoNode> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
        for (AbstractKontoNode node : this) {
            System.out.println(node);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {

        List<AbstractKontoNode> descendantOrSelf = new ArrayList<>();
        populateIteratorCollectionRecursive(descendantOrSelf);
        return descendantOrSelf.iterator();
    }

    private void populateIteratorCollectionRecursive(List<AbstractKontoNode> descendantOrSelf) {
        descendantOrSelf.add(this);
        for (AbstractKontoNode child : getChildren()) {
            child.populateIteratorCollectionRecursive(descendantOrSelf);
        }
    }
}
