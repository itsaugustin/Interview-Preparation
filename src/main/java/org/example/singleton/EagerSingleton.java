package org.example.singleton;

/**
 * In this approach, the instance is created at the time of class loading.
 */
public class EagerSingleton {
    // Step 1: Create a single instance eagerly
    private static final EagerSingleton instance = new EagerSingleton();

    // Step 2: Private constructor to prevent instantiation
    private EagerSingleton() {}

    // Step 3: Provide a public method to get the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Singleton Instance");
    }
}
