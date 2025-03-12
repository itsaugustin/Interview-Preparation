package org.example.singleton;

/**
 *  Lazy Initialization Singleton (Thread-Unsafe)
 *  This is not thread-safe, meaning multiple threads may create multiple instances.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton Instance");
    }
}
