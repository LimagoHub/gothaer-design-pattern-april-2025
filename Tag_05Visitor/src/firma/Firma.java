package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.visitor.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<AbstractMitarbeiter>();

    public void addMitarbeiter(final AbstractMitarbeiter mitarbeiter) {
        mitarbeiters.add(mitarbeiter);
    }

    public void removeMitarbeiter(final AbstractMitarbeiter mitarbeiter) {
        mitarbeiters.remove(mitarbeiter);
    }

    public void print() {
        for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
            System.out.println(mitarbeiter);
        }
    }

    public void iterate(MitarbeiterVisitor visitor) {
        for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
            //visitor.visit(mitarbeiter);
            mitarbeiter.accept(visitor);
        }
    }

}
