/*

https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

//Solution


import java.util.ArrayList;

import java.util.HashSet;

public class PangramChecker {
    public boolean check(String sentence) {

        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.size() == 26;
    }
}









//OLD SOLUTION
//import java.util.ArrayList;
//public class PangramChecker {
//    public boolean check(String sentence){
//        char[] arr = sentence.toLowerCase().toCharArray();
//
//        ArrayList<Character> arrayList = new ArrayList<Character>();
//
//        for(char c : arr){
//            arrayList.add(c);
//        }
//
//
//        char[] lowercaseAlphabet = {
//                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
//                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
//                'u', 'v', 'w', 'x', 'y', 'z'
//        };
//
//        int sum = 0;
//        for(char c: lowercaseAlphabet){
//            if(arrayList.contains(c)){
//                sum++;
//            }
//        }
//
//        if (sum == 26) {
//            return true;}
//
//        return false;
//    }
//}