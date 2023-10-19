package decorator_pattern;

abstract class Beverage {

    public abstract double cost();

}

class Espresso extends Beverage {

    @Override
    public double cost() {
        return 0.35;
    }
}

abstract class CondimentDecorator extends Beverage {

}

class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.57 + beverage.cost();
    }
}



public class Demo {
    public static void main(String[] args) {
        Beverage a = new Espresso();
        Beverage b = new Mocha(a);
        System.out.println(b.cost());
    }
}
