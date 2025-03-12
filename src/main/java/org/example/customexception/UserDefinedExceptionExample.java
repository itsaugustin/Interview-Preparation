package org.example.customexception;

/**
 * A user-defined exception (also called a custom exception) is created by extending the Exception
 * or RuntimeException class in Java. These exceptions are used to define specific error conditions
 * that are meaningful in a particular application.
 */
public class UserDefinedExceptionExample {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        } else {
            System.out.println("Registration successful!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Trying with a valid age
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

// Step 1: Create a custom exception by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
