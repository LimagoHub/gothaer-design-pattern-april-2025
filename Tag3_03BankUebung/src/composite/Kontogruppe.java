package composite;

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
}
