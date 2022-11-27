package hardCases1;

public interface Car {
    default void doRide(){
        System.out.println("I'm ride");
    }

}
