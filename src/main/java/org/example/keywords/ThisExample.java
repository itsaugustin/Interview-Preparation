package org.example.keywords;

/**
 * The 'this' keyword in Java is used to refer to the current instance of the class.
 * It is primarily used to eliminate confusion between instance variables and parameters,
 * call other constructors within the same class, and pass the current instance as an argument.
 */
public class ThisExample {
    int number;

    ThisExample(int number) {
        this.number = number; // 'this' refers to the current class instance
    }

    void display() {
        System.out.println("Number: " + this.number);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}
