/*

https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/java
DESCRIPTION:
Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 *  ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html
*/

//Solution

public class Solution {
    public static int zeros(int n) {
        // your beatiful code here

        int count = 0;

        for (int i = 5; i <= n; i *= 5) {
            count += n / i; // Count multiples of each power of 5
        }

        return count;
    }
}