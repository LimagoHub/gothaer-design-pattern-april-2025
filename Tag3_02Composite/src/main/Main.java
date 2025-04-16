package main;

import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {

        // Statt Node -> Kontogruppe (container für Konto und KontoGruppen)
        Node root = new Node("root");

        Node e1_1 = new Node("e1_1");
        root.appendChild(e1_1);

        Node e1_2 = new Node("e1_2");
        root.appendChild(e1_2);

        Node e2_1 = new Node("e2_1");
        e1_1.appendChild(e2_1);

        // Statt Leaf -> Konto (double balance)
        Leaf e2_2 = new Leaf("e2_2");
        e1_1.appendChild(e2_2);


        Leaf e2_3 = new Leaf("e2_3");
        e1_2.appendChild(e2_3);
        Leaf e2_4 = new Leaf("e2_4");
        e1_2.appendChild(e2_4);

        //root.print();
        // traverse(e1_1);
    }

    public static void traverse(AbstractNode abstractNode) {
        System.out.println(abstractNode);
        for(AbstractNode child : abstractNode.getChildren()) {
            traverse(child);
        }
    }
}