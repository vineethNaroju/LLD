package chapter1;

public class ToyDuck extends Duck {

    public ToyDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a toy duck");
        quackBehaviour.quack();
        flyBehaviour.fly();
    }
}
