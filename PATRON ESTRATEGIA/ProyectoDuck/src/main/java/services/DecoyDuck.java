package services;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("Soy un pato señuelo");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
