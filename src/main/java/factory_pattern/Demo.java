package factory_pattern;

import lombok.Getter;
import lombok.Setter;

abstract class Pizza {

    @Getter @Setter
    Dough dough;


    abstract void prepare();

}

class CheesePizza extends Pizza {

    IngredientFactory factory;

    CheesePizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        this.setDough(factory.createDough());
    }
}

class Dough {

}

class ThinCrust extends Dough {}
class ThickCrust extends Dough {}

abstract class IngredientFactory {

    public abstract Dough createDough();

}

class NYIngredientFactory extends IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }
}


abstract class PizzaStore {

    public abstract Pizza createPizza();
}

class NYPizzaStore extends PizzaStore {

    IngredientFactory factory;

    NYPizzaStore(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public Pizza createPizza() {
        return new CheesePizza(factory);
    }
}



public class Demo {
    public static void main(String[] args) {

        IngredientFactory nyFactory = new NYIngredientFactory();
        PizzaStore nyStore = new NYPizzaStore(nyFactory);
        nyStore.createPizza();
    }
}
