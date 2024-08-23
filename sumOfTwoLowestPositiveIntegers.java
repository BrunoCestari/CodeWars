/*
DESCRIPTION:
Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers. No floats or non-positive integers will be passed.

        For Java, those integers will come as double precision (long).

        For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

        [10, 343445353, 3453445, 3453545353453] should return 3453455.


*/




 // Solution


import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;

import java.util.Arrays;
// Solution


import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;

import java.util.Arrays;
class Kata{
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        //Your solution here
        long lowest = Long.MAX_VALUE;
        long secondLowest = Long.MAX_VALUE;

        for(long number : numbers) {
            if(number < lowest){
                secondLowest = lowest;
                lowest = number;
            } else if (number <secondLowest) {
                secondLowest = number;

            }
        }



        return lowest + secondLowest;

    }
}
