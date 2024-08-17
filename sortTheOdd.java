/*
https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java

Task
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
*/

//Solution

import java.util.ArrayList;
import java.util.Collections;

public class Kata {
    public static int[] sortArray(int[] array) {

        // Extract odd numbers
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        // Sort the odd numbers
        Collections.sort(oddNumbers);

        // Replace the odd numbers in the original array
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }

        return array;
    }
}