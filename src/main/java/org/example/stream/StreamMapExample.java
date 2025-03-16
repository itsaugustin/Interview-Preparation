package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "emma", "mike", "sara");

        // Using map() to convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
