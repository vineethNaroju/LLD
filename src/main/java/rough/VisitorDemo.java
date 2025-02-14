package rough;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {


    interface IVisitorA {

    }

    interface IVisitorB {

    }



    interface Visitor<K extends Node> {
        void visit (K node);
    }

    interface TextNodeVisitor extends Visitor<TextNode> {

        void visit(TextNode node);
    }

    interface ImageNodeVisitor extends Visitor<ImageNode> {
        void visit(ImageNode node);
    }


    class Node {
        List<Node> list = new ArrayList<>();


        void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    class TextNode extends Node {

    }

    class ImageNode extends Node {

    }


}
