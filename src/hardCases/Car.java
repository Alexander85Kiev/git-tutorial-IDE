package hardCases;

public interface Car {
    default void doRide(){
        System.out.println("I am riding!!!");
    }
    void getName();
}
