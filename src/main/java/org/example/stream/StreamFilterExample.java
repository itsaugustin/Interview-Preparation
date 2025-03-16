package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Using filter() to get even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
