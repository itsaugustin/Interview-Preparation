package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Get a distinct values from list of integers in java stream
public class DistinctValues {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1);

        // Using distinct() to get distinct values and collect to a List
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println("Original list: " + numbers);
        System.out.println("Distinct values: " + distinctNumbers);


        // If you want a Set instead of a List (Sets inherently store only unique values):
        java.util.Set<Integer> distinctNumberSet = numbers.stream()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("Distinct values (Set): " + distinctNumberSet);


        // For primitive int array:
        int[] intArray = {1, 2, 2, 3, 4, 4, 5, 1};

        List<Integer> distinctIntArray = Arrays.stream(intArray)
                .distinct()  // IntStream has its own distinct()
                .boxed()      // Convert to Stream<Integer>
                .toList();

        System.out.println("Original int array: " + Arrays.toString(intArray));
        System.out.println("Distinct values from int array: " + distinctIntArray);


        //Or to get a Set:
        java.util.Set<Integer> distinctIntArraySet = Arrays.stream(intArray)
                .distinct()  // IntStream has its own distinct()
                .boxed()      // Convert to Stream<Integer>
                .collect(Collectors.toSet());

        System.out.println("Distinct values from int array (Set): " + distinctIntArraySet);

    }
}
