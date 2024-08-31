/*

https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java


A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

For example, take 153 (3 digits), which is narcissistic:

    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
*/

//Solution



 class NumberUtils {

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        String numberStr = Integer.toString(number);
        int expoent = numberStr.length();
        int sum = 0;
        for(int i = 0; i < numberStr.length(); i ++){
            sum += (int) Math.pow(Character.getNumericValue(numberStr.charAt(i)), expoent);
        }
        return sum == number;
    }

}