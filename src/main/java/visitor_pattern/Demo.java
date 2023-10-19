package visitor_pattern;


import java.util.ArrayList;
import java.util.List;


interface Visitor {
    void visit(Node node);
}

class TotalCountVisitor implements Visitor {
    int sum = 0;

    @Override
    public void visit(Node node) {
        sum += node.val;
    }
}

class Node {
    final List<Node> children = new ArrayList<>();
    final int val;

    public Node(int val) {
        this.val = val;
    }

    void accept(Visitor visitor) {
        for(Node child : children) {
            child.accept(visitor);
        }

        visitor.visit(this);
    }

    void addChild(Node child) {
        children.add(child);
    }
}

public class Demo {
    public static void main(String[] args) {
        Node root = new Node(10);

        root.addChild(new Node(20));
        root.addChild(new Node(30));

        Node abc = new Node(20);
        abc.addChild(new Node(10));
        abc.addChild(new Node(40));

        root.addChild(abc);

        TotalCountVisitor visitor = new TotalCountVisitor();

        root.accept(visitor);

        System.out.println(visitor.sum);
    }
}
