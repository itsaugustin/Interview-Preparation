package org.example.singleton;

/**
 * The Singleton Pattern ensures that a class has only one instance and provides
 * a global access point to it. This is useful when exactly one object is required
 * to control the actions throughout the execution of a program.
 */
public class SingletonExample {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.showMessage();
    }
}
