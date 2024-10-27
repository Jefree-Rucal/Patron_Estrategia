package services;

public class NoMakeSound implements SoundBehavior {

    public NoMakeSound() {
    }

    @Override
    public void makeSoud() {
        System.out.println("No hago Quack");
    }

    @Override
    public String toString() {
        return "NoMakeSound{}";
    }
}
