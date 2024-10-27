package services;

public class FlyLikeRocket implements FlyBehavior {

    public FlyLikeRocket() {
    }

    @Override
    public void fly() {
        System.out.println("Soy un pato explosivo");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }

}
