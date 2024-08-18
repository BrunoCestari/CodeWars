/*
https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.

*/

//Solution


import java.util.HashMap;


public class Kata {

    public static String high(String s) {

        // Map of alphabet values
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++){
            alphabetMap.put(alphabet.charAt(i), i + 1);
        }

        // Break the string in an stringArray
        String[] wordArray = s.trim().split(" ");

        //Create arrayOfValues
        int[] arrayOfValues = new int[wordArray.length];

        int index = 0;
        for(String word : wordArray){
            int value = 0;
            for(int i = 0; i < word.length(); i++){
                value += alphabetMap.get((Character) word.charAt(i));
            }
            arrayOfValues[index] = value;
            index++;
        }

        // Find the index of the highest value in arrayOfvalues. The positions of values/words arrays are the same

        int indexOfMaxValue = 0;
        for (int i = 1; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] > arrayOfValues[indexOfMaxValue]) {
                indexOfMaxValue = i;
            }
        }


        System.out.println(wordArray[indexOfMaxValue]);
        return wordArray[indexOfMaxValue];
    }

}

