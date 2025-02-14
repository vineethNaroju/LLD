package behavioral.visitor;


interface Visitable {
    public double accept(TaxVisitor taxVisitor);
}

class Item implements Visitable {

    @Override
    public double accept(TaxVisitor taxVisitor) {
        return taxVisitor.visit(this);
    }
}

class Liquor extends Item {


}

class Tobacco extends Item {

}


interface Visitor {

    public double visit(Item item);

}

abstract class TaxVisitor implements Visitor {
    public abstract double visit(Item item);
}

class LiquorTaxVisitor extends TaxVisitor {
    @Override
    public double visit(Item item) {
        return 0;
    }
}




public class Taxes {

    public static void main(String[] args) {

        Liquor liquor = new Liquor();
        LiquorTaxVisitor liquorTaxVisitor = new LiquorTaxVisitor();

        liquor.accept(liquorTaxVisitor);

    }
}
