package org.example.keywords;

/**
 * The 'static' keyword in Java is used to define class-level properties and methods.
 * - A static variable belongs to the class rather than an instance.
 * - A static method can be called without creating an instance of the class.
 * - A static block is executed once when the class is loaded.
 * - Static methods cannot directly access non-static variables or methods.
 */
public class StaticExample {
    static int staticVar = 50;
    int nonStaticVar = 100;

    static void staticMethod() {
        System.out.println("Static method called. Static Var: " + staticVar);
        // System.out.println("Non-static var: " + nonStaticVar); // This would cause an error
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called. Static Var: " + staticVar);
        System.out.println("Non-static Var: " + nonStaticVar);
    }

    public static void main(String[] args) {
        StaticExample.staticMethod(); // Calling static method without an object

        StaticExample obj = new StaticExample();
        obj.nonStaticMethod(); // Calling non-static method using an object
    }
}
