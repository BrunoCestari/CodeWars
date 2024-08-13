/*
https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

This is the first kata in series:

Find the unique number (this kata)
Find the unique string
Find The Unique

*/

//Solution


import java.util.Arrays;

// Make sure your class is public
public class Kata {
    public static double findUniq(double arr[]) {

        //finding who is not unique
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double notUnique = 0;


        if (a == b) {
            notUnique = a;
        }
        if (a == c) {
            notUnique = a;
        }
        if (b == c) {
            notUnique = b;
        }

        // avoiding division by zero.
        double sum = 0;
        if (notUnique == 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        //If notUnique != 0
        double unique = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]/notUnique != 1){
                unique = arr[i];
                break;
            }
        }

        return unique;
    }


}



// A better solution provided by GPT 3.5

public class Kata {
    public static double findUniq(double arr[]) {

        double a = arr[0];
        double b = arr[1];
        double c = arr[2];

        // Determine the non-unique number
        double notUnique = (a == b || a == c) ? a : b;

        // Find and return the unique number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != notUnique) {
                return arr[i];
            }
        }

        // Fallback (though logically, it should never reach here)
        return -1;
    }
}

// Refining even more the first solution

public class Kata {
    public static double findUniq(double arr[]) {

        //finding who is not unique
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double notUnique = 0;


        if (a == b) {
            notUnique = a;
        }
        if (a == c) {
            notUnique = a;
        }
        if (b == c) {
            notUnique = b;
        }



        for (int i = 0; i < arr.length; i++){
            if (arr[i]!=  notUnique){
                return arr[i];
            }
        }


        return 0;
    }


}

//even more cool solution

import java.util.Arrays;
public class Kata {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if(arr[0]==arr[1])
            return arr[arr.length-1];
        else
            return arr[0];

    }
}