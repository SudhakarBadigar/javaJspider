package exceptionHanling;

import java.util.Scanner;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

class Login {
    private static final String USERNAME = "Login";
    private static final String PASSWORD = "123";

    public static void authenticate(String username, String password) throws InvalidLoginException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new InvalidLoginException("Invalid login credentials");
        }
    }
}

public class CustomException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            Login.authenticate(username, password);
            System.out.println("Logged in successfully");
        } catch (InvalidLoginException e) {
            System.out.println("Login failed: " + e.getMessage());
            System.out.println("...............");
            e.printStackTrace();
        }

        scanner.close();
    }
}






