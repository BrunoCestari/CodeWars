/*
https://www.codewars.com/kata/530e15517bc88ac656000716/train/java
ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet. ROT13 is an example of the Caesar cipher.

Create a function that takes a string and returns the string ciphered with Rot13. If there are numbers or special characters included in the string, they should be returned as they are. Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
*/

//Solution


import java.util.HashMap;

 class Kata {
    public static String rot13(String str) {

        if (str.isEmpty()) return "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : array) {
            if(!(c>='a' && c <= 'z') && !(c>= 'A' && c <= 'Z')) {
                sb.append(c);
                 continue;
            }

            boolean isUpperCase = false;
            if (Character.isUpperCase(c)) isUpperCase = true;

            c = Character.toLowerCase(c);

            int value = alphabet.indexOf(c);
            int cypherValue;

            if (value > 12) {
                cypherValue = value - 13;
            } else {
                cypherValue = value + 13;
            }

            if (isUpperCase) {
                sb.append(Character.toUpperCase(alphabet.charAt(cypherValue)));

            } else {
                sb.append(alphabet.charAt(cypherValue));
            }



        }
            return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Kata.rot13("Ruby is cool!"));
    }
}