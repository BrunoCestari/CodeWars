/*

https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

*/


//REFACTORED SOLUTION

public class StringSplit {
    public static String[] solution(String s) {
        int arrayLength = (s.length() + 1) / 2;
        String[] result = new String[arrayLength];

        for (int i = 0; i < s.length(); i += 2) {
            // Get the first character
            char first = s.charAt(i);
            char second = (i + 1 < s.length()) ? s.charAt(i + 1) : '_';
            result[i / 2] = "" + first + second;
        }
        return result;
    }
}





//FIRST SOLUTION

//public class StringSplit {
//    public static String[] solution(String s) {
//
//        char[] arr = s.toCharArray();
//
//
//        // Even string
//        if (s.length() % 2 == 0) {
//            String[] solutionArray = new String[s.length() / 2];
//            for (int i = 0; i < solutionArray.length; i++) {
//                StringBuilder sb = new StringBuilder();
//                solutionArray[i] = sb.append(arr[i*2]).append(arr[i*2+1]).toString();
//            }
//            return solutionArray;
//        }
//
//        // Odd String
//        String[] solutionArray = new String[(s.length() + 1 )/ 2];
//        for (int i = 0; i < solutionArray.length -1; i++) {
//            StringBuilder sb = new StringBuilder();
//            solutionArray[i] = sb.append(arr[i*2]).append(arr[i*2 +1]).toString();
//        }
//
//        StringBuilder sb = new StringBuilder();
//        solutionArray[solutionArray.length -1] = sb.append(arr[arr.length -1]).append("_").toString();
//        return solutionArray;
//    }
//
//}
