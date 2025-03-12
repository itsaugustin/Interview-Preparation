package org.example.keywords;

/**
 * The 'final' keyword in Java is used to declare constants, prevent method overriding,
 * and restrict class inheritance.
 * - A final variable cannot be changed after initialization.
 * - A final method cannot be overridden by subclasses.
 * - A final class cannot be inherited by any other class.
 */
public class FinalExample {
    final int value = 100; // final variable (cannot be changed)

    final void show() { // final method (cannot be overridden)
        System.out.println("Final variable value: " + value);
    }
}

class SubClass extends FinalExample {
    // Cannot override final method
    // void show() { System.out.println("Trying to override"); } // This would cause an error
}
