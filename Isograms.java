/*
https://www.codewars.com/kata/54ba84be607a92aa900000f1


DESCRIPTION:
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
*/

//Solution

import java.util.HashSet;
import java.util.Set;


//Refactor solution
class isogram {
    public static boolean isIsogram(String str) {
        str = str.trim().toLowerCase();

        if (str.isEmpty()) {
            return true;
        }

        Set<Character> seenChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (seenChars.contains(c)) {
                return false;
            }

            seenChars.add(c);
        }

        return true;
    }
}






//old solution not efficient (nest loops)
class Isogram1 {
    public static boolean  isIsogram(String str) {
        // ...
        str = str.trim().toLowerCase();
        System.out.println(str);
        if(str.isEmpty()){
            return true;
        }


        for(int i = 0; i <str.length(); i++){

            char c = str.charAt(i);
            int count = 0;

            for(int j = 0; j <str.length(); j++){
                if(c == str.charAt(j)){
                    count++;
                }
                if(count > 1){
                    return false;
                }
            }


        }
        return true;
    }
}