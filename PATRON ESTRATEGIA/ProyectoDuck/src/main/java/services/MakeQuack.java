package services;

public class MakeQuack implements SoundBehavior {

    public MakeQuack() {
    }

    @Override
    public void makeSoud() {
        System.out.println("Quack");
    }

    @Override
    public String toString() {
        return "MakeQuack{}";
    }
}
