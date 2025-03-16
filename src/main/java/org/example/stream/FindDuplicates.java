package org.example.stream;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6, 3);
        List<Integer> duplicates = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .distinct()
                .toList();

        Set<Integer> a = new HashSet<>(numbers);

        System.out.println("Unique : " + a);
        System.out.println("Duplicates: " + duplicates);
    }
}
