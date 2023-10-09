package chapter1;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cant Fly");
    }
}
