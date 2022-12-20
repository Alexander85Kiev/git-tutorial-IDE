package module3Arrays;

import hardCases1.Sounds;

import java.util.*;

public class MoonComputerTests {
    // public void testBasicInputOutput() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Input string: ");
    //     String name = scanner.nextLine();
    //     System.out.println("Input data is :"+ name);
    //     scanner.close();
    // }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println((firstNumber + secondNumber) + " " + (firstNumber - secondNumber) + " " + (firstNumber * secondNumber) + " " + (firstNumber / secondNumber));
        scanner.close();
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        boolean d = a && b;
        boolean e = d || c;
        System.out.println(d + " " + e);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        // computerTests.testBasicInputOutput();
//        computerTests.testMath();
        computerTests.testLogicalOperators();
    }
}

