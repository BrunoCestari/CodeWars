/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'

*/

//Solution

public class Kata {

        public static String solution(String str) {
            return new StringBuilder(str).reverse().toString();
        }

    }



 // FIRST SOLUTION
//
//    public static String solution(String str) {
//        String reversed_str = "";
//        for (int i = str.length() -1; i >= 0; i--){
//            reversed_str += Character.toString(str.charAt(i));
//        }
//        return reversed_str;
//    }

}