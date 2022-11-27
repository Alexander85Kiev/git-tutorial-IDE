package module8L2.interfaces;

public class Robot implements Namable,Movable{
    public String name;
    @Override
    public void sayYourName() {

    }

    @Override
    public void move() {
        System.out.println("I'm " + name);
    }
    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
