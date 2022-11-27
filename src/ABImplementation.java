import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABImplementation implements A,B{

    @Override
    public void doA() {
        System.out.println("doing A");
    }

    @Override
    public void common() {

    }

    @Override
    public void doB() {
        System.out.println("doing B");
    }

    public static void main(String[] args) {
        ABImplementation abImplementation = new ABImplementation();
        abImplementation.doA();
        abImplementation.doB();

        ImplOfA1 implOfA1 = new ImplOfA1();
        ImplOfA2 implOfA2 = new ImplOfA2();
        List<A> aVariant= new ArrayList<>(Arrays.asList(implOfA1,implOfA2)) {

        };


    }








}
