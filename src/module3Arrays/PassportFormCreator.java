package module3Arrays;

import java.util.Scanner;

public class PassportFormCreator {

    public void createForms() {
            String name = new Scanner(System.in).next();
            String secondName = new Scanner(System.in).next();
            int age = new Scanner(System.in).nextInt();
            System.out.println(name + " " + secondName + " " + age * 10);
            System.out.println(name.toUpperCase() + '\n' + secondName.toUpperCase() + '\n' + age * 10);
            new Scanner(System.in).close();
        }


    public static void main(String[] args) {
        PassportFormCreator passportFormCreator = new PassportFormCreator();
        passportFormCreator.createForms();
    }
}
