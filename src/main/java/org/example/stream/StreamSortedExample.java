package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSortedExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 6);

        // Using sorted() for ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();

        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
