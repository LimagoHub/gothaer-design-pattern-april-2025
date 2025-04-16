package main;

import composite.AbstractKontoNode;
import composite.Konto;
import composite.Kontogruppe;
import composite.visitor.PrintVisitor;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Statt Kontogruppe -> Kontogruppe (container für Konto und KontoGruppen)
        Kontogruppe root = new Kontogruppe("root");

        Kontogruppe e1_1 = new Kontogruppe("e1_1");
        root.appendChild(e1_1);

        Kontogruppe e1_2 = new Kontogruppe("e1_2");
        root.appendChild(e1_2);

        Kontogruppe e2_1 = new Kontogruppe("e2_1");
        e1_1.appendChild(e2_1);

        // Statt Konto -> Konto (double balance)
        Konto e2_2 = new Konto("e2_2");
        e1_1.appendChild(e2_2);


        Konto e2_3 = new Konto("e2_3");
        e1_2.appendChild(e2_3);
        Konto e2_4 = new Konto("e2_4");
        e1_2.appendChild(e2_4);

        //root.print();

       /* for (AbstractKontoNode node : root) {
            System.out.println(node);
        }
        for(Iterator<AbstractKontoNode> it = root.iterator(); it.hasNext();) {
            AbstractKontoNode node = it.next();
            System.out.println(node);
        }
        //traverse(root);

        */
        root.iterate(new PrintVisitor());
    }

    public static void traverse(AbstractKontoNode abstractKontoNode) {
        System.out.println(abstractKontoNode);
        for(AbstractKontoNode child : abstractKontoNode.getChildren()) {
            traverse(child);
        }
    }
}