package org.example.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountStream {

    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .filter(c -> !Character.isWhitespace(c)) // Optional: Remove spaces
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        charCount.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
