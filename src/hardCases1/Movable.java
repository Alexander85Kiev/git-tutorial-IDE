package hardCases1;

public interface Movable extends Car {
    void doMove();

    @Override
    default void doRide() {
        System.out.println("I'm ride");
    }
}
