/*
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

//Solution






public class Troll {
    public static String disemvowel(String str) {

        StringBuilder sb = new StringBuilder(str);
        for (int i = sb.length() -1 ; i >= 0; i--){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' ||  ch == 'u'){
                sb.deleteCharAt(i);
            }
            else if (ch == 'A' || ch == 'E' || ch == 'I' ||  ch == 'O' ||  ch == 'U'){
                sb.deleteCharAt(i);
            }
        }
        return  sb.toString();

    }
}