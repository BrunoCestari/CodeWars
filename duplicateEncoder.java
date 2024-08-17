/*

https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

//Solution
public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase(); // Convert the word to lowercase for case insensitivity
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = 0;

            // Count occurrences of the current character
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    count++;
                }
            }

            // Append ')' if the character appears more than once, otherwise append '('
            if (count > 1) {
                encoded.append(')');
            } else {
                encoded.append('(');
            }
        }

        return encoded.toString();
    }
}

// A most efficient solution using HashMap

import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase(); // Convert to lowercase for case insensitivity
        HashMap<Character, Integer> charCount = new HashMap<>();

        // First pass: Count occurrences of each character
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder encoded = new StringBuilder();

        // Second pass: Build the encoded string
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (charCount.get(c) > 1) {
                encoded.append(')');
            } else {
                encoded.append('(');
            }
        }

        return encoded.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Success")); // Expected output: ")())())"
        System.out.println(encode("(( @"));    // Expected output: "))(("
    }
}
