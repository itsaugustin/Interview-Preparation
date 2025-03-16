package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCombinedExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Steve", "Anna");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))  // Filter names starting with 'A'
                .map(String::toUpperCase)               // Convert to uppercase
                .sorted()                               // Sort in ascending order
                .toList();

        System.out.println("Processed Names: " + result);
    }
}
