package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor implements MitarbeiterVisitor {


    private int countGehaltsEmpfaenger=0    ;
    private int countLohnEmpfaenger=0    ;

    public int getTotal() {
        return getCountGehaltsEmpfaenger()+getCountLohnEmpfaenger();
    }

    public int getCountGehaltsEmpfaenger() {
        return countGehaltsEmpfaenger;
    }

    public int getCountLohnEmpfaenger() {
        return countLohnEmpfaenger;
    }

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        countLohnEmpfaenger ++;
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        countGehaltsEmpfaenger ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("total=").append(getTotal());
        sb.append(", countGehaltsEmpfaenger=").append(countGehaltsEmpfaenger);
        sb.append(", countLohnEmpfaenger=").append(countLohnEmpfaenger);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void init() {
        countGehaltsEmpfaenger=0;
        countLohnEmpfaenger=0;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }
}
