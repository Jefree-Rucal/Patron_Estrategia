package services;

public class MakeSquick implements SoundBehavior {

    public MakeSquick() {
    }

    @Override
    public void makeSoud() {
        System.out.println("squick");
    }

    @Override
    public String toString() {
        return "MakeSquick{}";
    }
}
