package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter{

    private double arbeitszeit = 0;
    private double stundenlohn = 12;

    public LohnEmpfaenger(final String name) {
        super(name);
    }

    public LohnEmpfaenger(final String name, final double arbeitszeit, final double stundenlohn) {
        super(name);
        this.arbeitszeit = arbeitszeit;
        this.stundenlohn = stundenlohn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("arbeitszeit=").append(arbeitszeit);
        sb.append(", stundenlohn=").append(stundenlohn);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
