package template_pattern;

import cab_booking_design_problem.pojos.Cab;

abstract class CaffeineBeverage {
    final void prepareRecipe() {
        brew();
        cheers();
    }

    abstract void brew();
    abstract String getName();

    void cheers() {
        System.out.println("Enjoy your " + getName() + " !!! ");
    }
}

class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee .... done");
    }

    @Override
    String getName() {
        return "Coffee";
    }
}



public class Demo {

    public static void main(String[] args) {
        CaffeineBeverage cb = new Coffee();
        cb.prepareRecipe();
    }
}
