package chapter1;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new SimpleQuack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Mallard Duck.");
        quackBehaviour.quack();
        flyBehaviour.fly();
    }
}
