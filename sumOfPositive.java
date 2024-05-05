/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
*/

//Solution

public class Positive{

    public static int sum(int[] arr){
        if (arr == null){
            return 0;
        }
        int count = 0;
        for (int i: arr){
            if (i > 0){
                count += i;
            }
        }
        return count;
    }
}