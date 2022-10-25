import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputStream {
    public static void main(String[] args) {
       // simpeConsoleIn();
        //readInt();
       // printNameAge();
        fileRead();
    }

    private static void simpeConsoleIn() {
        Scanner scanner= new Scanner(System.in);

        int next = scanner.nextInt();
        System.out.println(next);
    }
    private static void readInt(){
        Scanner scanner = new Scanner("10 20 55");
        int i = scanner.nextInt();
        System.out.println("i = " + i);
    }

    private static void printNameAge(){
        System.out.println("How old are you");
        int age = new Scanner(System.in).nextInt();
        System.out.println("What is your name");
        String name = new Scanner(System.in).next();

   //     System.out.println("My name is " + name + " I am " + age + " 36old");
        System.out.printf("My name is %s I am %d", name, age);
    }

    private static void fileRead(){
        File file = new File("C:/Users/Oleksandr_Tymoshenko/JavaProjects/git-tutorial-IDE/src/input.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            int index = 0;

            while (fileScanner.hasNext()){
                String s = fileScanner.nextLine();
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
