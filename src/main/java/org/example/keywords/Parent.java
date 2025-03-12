package org.example.keywords;

/**
 * The 'super' keyword in Java is used to refer to the immediate parent class.
 * It is commonly used for:
 * - Accessing parent class variables when they are hidden by child class variables.
 * - Invoking parent class methods that are overridden in the child class.
 * - Calling the parent class constructor from a subclass constructor.
 */
public class Parent {
    int num = 10;

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int num = 20;

    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num using super: " + super.num);
        super.show(); // Calling parent class method
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
