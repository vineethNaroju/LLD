package chapter1;

public class SimpleQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quacking !!!");
    }
}
