/*
https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.
*/

//Solution


import java.math.BigInteger;

public class Kata {
    public static String incrementString(String str) {
        // Case 1: If the string is empty, return "1"
        if (str.isEmpty()) {
            return "1";
        }

        // Case 2: Check if the string ends with a digit
        int index = str.length() - 1;


        for (; index >= 0 && Character.isDigit(str.charAt(index)); index--);


        String prefix = str.substring(0, index + 1);  // All the characters before the number
        String suffix = str.substring(index + 1);    // The numeric part of the string

        // If there's no numeric suffix, append "1"
        if (suffix.isEmpty()) {
            return str + "1";
        }

        // Use BigInteger to handle very large numbers
        BigInteger number = new BigInteger(suffix);
        number = number.add(BigInteger.ONE);  // Increment the number by 1

        // Preserve leading zeros
        String newSuffix = String.format("%0" + suffix.length() + "d", number);

        return prefix + newSuffix;
    }
}




