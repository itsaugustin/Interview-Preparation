package org.example.string;

public class StringCleaner {

    public static String cleanString(String input) {
        if (input == null) {
            return "";
        }
        // Remove all non-alphabetic characters
        String cleaned = input.replaceAll("[^a-zA-Z ]", "");
        int count = cleaned.replace(" ", "").length(); // Count characters excluding spaces
        System.out.println("Cleaned Character Count: " + count);
        return cleaned;
    }

    public static void main(String[] args) {
        String testStr = "H3llo! W@orld#123";
        String cleanedStr = cleanString(testStr);
        System.out.println("Original: " + testStr);
        System.out.println("Cleaned: " + cleanedStr);
    }
}
