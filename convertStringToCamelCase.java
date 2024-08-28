/*

https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/

//Solution



import java.lang.StringBuilder;


class Solution{

    static String toCamelCase(String s){
        String[] arr = s.split("_|-");

        for(int i = 1; i < arr.length; i++){

            StringBuilder sb = new StringBuilder(arr[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            arr[i] = sb.toString();
        }


        return String.join("", arr);
    }
}