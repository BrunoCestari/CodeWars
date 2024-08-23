/*

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

 */
//Solution

public class Kata {
    public static int findShort(String s) {
        String[] arr = s.split(" ");

        int length = arr[0].length();

        for(int i = 1; i < arr.length; i++) {
            String word = arr[i];
            if( arr[i].length() < length ){
                length = arr[i].length();
            }
        }

        return length;
    }
}