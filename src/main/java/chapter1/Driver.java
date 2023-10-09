package chapter1;

public class Driver {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();

        Duck toy = new ToyDuck();
        toy.display();
    }
}
