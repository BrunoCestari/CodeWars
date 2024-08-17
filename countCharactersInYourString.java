/*
https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java

The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
*/

//Solution


import java.util.Map;
import java.util.TreeMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        if(str == null){
            return null;
        }

        TreeMap<Character, Integer> map = new TreeMap<>();

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            char c = str.charAt(i);

            for(int j = 0 ; j < str.length(); j++){
                if( c == str.charAt(j)){
                    count++;
                }
            }
            map.put(c, count);

        }
        return map;
    }
}