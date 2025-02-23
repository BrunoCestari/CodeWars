    /*
https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
*/

//Solution


public class FindOutlier {
    static int find(int[] integers) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                count++;
            }
        }
        boolean arrayIsEven = count >= 2;

        //If array is even, find the odd

        for(int i = 0; i < integers.length; i++){
           if(arrayIsEven && integers[i] % 2 != 0){
               return integers[i]; //return the first odd number
           }
            if(!arrayIsEven && integers[i] % 2 == 0){
                return integers[i]; //return the first even number
            }

        }
        return 0; // no outlier found
    }
}




//Clean solution:

class FindOutlier2 {
        static int find(int[] integers) {

            boolean isMostlyEven =
                    (integers[0] % 2 == 0 ? 1 : 0) +
                            (integers[1] % 2 == 0 ? 1 : 0) +
                            (integers[2] % 2 == 0 ? 1 : 0) >= 2;

            for (int number : integers) {
                if ((isMostlyEven && number % 2 != 0) || (!isMostlyEven && number % 2 == 0)) {
                    return number;
                }
            }

            return 0;
        }
    }