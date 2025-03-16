package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestRepeatedWord {

    public static void main(String[] args) {
        String text = "Radhan is a radhan A is a is";

        String secondHighest = Arrays.stream(text.toLowerCase().split("\\s+")) // Split into words, lowercase
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count word occurrences
                .entrySet().stream() // Stream of entries (word, count)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sort by count descending
                .skip(1) // Skip the highest count
                .findFirst() // Get the first (second highest)
                .map(Map.Entry::getKey) // Extract the word
                .orElse(null); // Handle cases where there's no second highest

        System.out.println("Second highest repeated word: " + secondHighest); // Output: is
    }
}
