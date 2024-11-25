/*

https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False


*/



import java.util.HashMap;

class Scramblies {

     public static HashMap<Character, Integer> getCharMap(String str) {
         HashMap<Character, Integer> map = new HashMap<>();
         for(int i = 0; i < str.length(); i++){
             char c = str.charAt(i);
             if(map.containsKey(c)) continue;
             map.put(c, str.replaceAll("[^" + c + "]", "").length());
         }
         return map;
     }


    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> mapStr2 = getCharMap(str2);
        HashMap<Character, Integer> mapStr1 = getCharMap(str1);



       for(Character key : mapStr2.keySet() ){
           if(!mapStr1.containsKey(key)) return false;
           if(mapStr1.get(key)/mapStr2.get(key) < 1) return false;
       }

        return true;
    }
}


