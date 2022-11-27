package module8L2.interfaces;

public class Cat implements Namable,Movable {
    public String name;

    @Override
    public void sayYourName() {
        System.out.println("I'm Cat");
    }

    @Override
    public void move() {
        System.out.println("I run");
    }
    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
