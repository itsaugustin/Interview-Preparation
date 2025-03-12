package org.example.singleton;

/**
 * Best Approach: Bill Pugh Singleton (Efficient and Thread-Safe)
 * No synchronization overhead, thread-safe, and only initializes when required.
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    // Inner static helper class to hold the singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Bill Pugh Singleton Instance");
    }
}
