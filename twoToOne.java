/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/

//Solution


import java.util.TreeSet;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        TreeSet<Character> charSet = new TreeSet<>();

        String s1s2 = s1 + s2;

        for(int i = 0; i < s1s2.length(); i++){
            charSet.add(s1s2.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(char c : charSet){
            sb.append(c);
        }

        return sb.toString();
    }
}