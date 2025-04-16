package composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractKontoNode {

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
        System.out.println(this);
        for (var child : getChildren()) {
            child.print();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
