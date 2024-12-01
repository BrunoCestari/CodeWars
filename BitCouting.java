/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

*/

//Solution


class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        String binaryString = Integer.toBinaryString(n);
        int sum = 0;
        for (int i = 0; i < binaryString.length(); i++){
            char ch = binaryString.charAt(i);
            int numericValue = Character.getNumericValue(ch);
            sum += numericValue;
        }
        return sum;
    }

// Cool solution from another user:

    public static int countBitsCool(int n) {
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }
}



