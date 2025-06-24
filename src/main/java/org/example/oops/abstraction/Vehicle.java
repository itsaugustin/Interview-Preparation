package org.example.oops.abstraction;

/*
Hiding internal details and showing essential features is abstraction
 */

// here start is essential methods... same like interface method declaration
// and implementing classes and method for internal details
abstract class Vehicle {
    abstract void start();  // abstract method
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

