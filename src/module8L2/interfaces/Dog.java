package module8L2.interfaces;

public class Dog implements Namable, Movable{
    public String name;

    @Override
    public void sayYourName() {
        System.out.println("I'm Dog");
    }

    @Override
    public void move() {
        System.out.println("I'm moving");
    }

    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
