package module8L2.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalNameTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //      cat.sayYourName();


        Bird bird = new Bird();
        //    bird.sayYourName();

        Dog dog = new Dog();
        //  dog.sayYourName();
        Robot robot = new Robot();

        List<Namable> namableList = new ArrayList<>(Arrays.asList(cat, dog, bird));
        for (Namable namable : namableList) {
            namable.sayYourName();
        }

        List<Movable> movables = new ArrayList<>(Arrays.asList(cat, dog, bird, robot));
        for (Movable movable : movables) {
            movable.move();

        }

        List<Marker> allItems = new ArrayList<>(Arrays.asList(cat,bird,dog,robot));
        for (Marker allItem : allItems) {
         allItem.doWork();
        }
    }
}
