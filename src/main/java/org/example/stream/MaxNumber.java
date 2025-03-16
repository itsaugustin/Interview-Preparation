package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// I have a list of integers and I want to get only max number from that list using stream api
public class MaxNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15);

        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());

        if (maxNumber.isPresent()) {
            System.out.println("Max number: " + maxNumber.get()); // Output: 20
        } else {
            System.out.println("List is empty");
        }


        // Handling Empty List more concisely (Java 9+):
        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(null); // Or provide a default value like -1, Integer.MIN_VALUE, etc.

        System.out.println("Max number (concise): " + max); // Output: 20


        // Even more concisely with orElseThrow (to throw exception on empty list):

        Integer max2 = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("List is empty"));

        System.out.println("Max number (orElseThrow): " + max2); // Output: 20

        // Example with empty list
        List<Integer> emptyList = Arrays.asList();
        Integer max3 = emptyList.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);
        System.out.println("Max number from empty list: " + max3); // Output: null

    }
}
