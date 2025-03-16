package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSortedDescending {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 6);

        // Sorting in descending order using Comparator.reverseOrder()
        List<Integer> sortedDescending = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println("Sorted Descending: " + sortedDescending);
    }
}
