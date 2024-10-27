package services;

public class FlyWithWings implements FlyBehavior{

    public FlyWithWings() {
    }

    @Override
    public void fly() {
        System.out.println("estoy volando con las alas");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}
