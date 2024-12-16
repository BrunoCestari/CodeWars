/*
https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/java

Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

*/

//Solution


class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {

        long a = 0;
        long b = 1;

        while(true){
            if( a * b == prod){
                return new long[]{a, b, 1};
            } else if (a*b > prod) {
                return new long[]{a, b, 0};

            }

            long next = a + b;
            a = b;  
            b = next;
        }

    }
}