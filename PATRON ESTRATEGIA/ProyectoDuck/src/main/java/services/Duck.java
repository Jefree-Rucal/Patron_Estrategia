package services;


import lombok.Setter;

@Setter

public abstract class Duck {

    public Duck() {
    }

    protected FlyBehavior fb;
    protected SoundBehavior sb;

    public abstract void display();

    public void performFly(){
        fb.fly();
    }

    public void performSound(){
        sb.makeSoud();
    }

    public void swim(){
        System.out.println("Estoy nadando");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}
