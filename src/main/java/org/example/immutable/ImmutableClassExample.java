package org.example.immutable;

/**
 * Immutable Class in Java
 * An immutable class is a class whose objects cannot be modified after they are created. Any change to the object results in a new object being created.
 *
 * Characteristics of an Immutable Class
 * Declare the class as final to prevent subclassing.
 * Make all fields private and final so they cannot be modified after initialization.
 * Do not provide any setters or methods that modify fields.
 * Provide a constructor to initialize all fields.
 * If the class has mutable fields, return a deep copy instead of the original reference.
 */
public class ImmutableClassExample {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", 25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // person.age = 30;  // This will cause an error (fields are final)
        // person.name = "Alice"; // Not allowed
    }
}

final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor to initialize the fields
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods to access values (no setters!)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No methods that modify fields (immutability enforced)
}

