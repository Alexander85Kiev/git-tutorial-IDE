package QuestionAndAnswer;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type password");
            String password = scanner.nextLine();
            try {
                passwordValidator(password);
            } catch (ValidationException e
            ) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void passwordValidator(String password) throws ValidationException {
        if (password == null || password.isBlank()) {
            throw new ValidationException("Empty password");
        } else if (password.length() < 8) {
            throw new ValidationException("lenght must be longer");
        }
    }
}
