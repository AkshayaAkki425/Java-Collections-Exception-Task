// CustomExceptionExample.java

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access Granted!");
        }
    }

    public static void main(String[] args) {

        int age = 16; // Change this value to test

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}