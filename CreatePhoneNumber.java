/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!


*/

//Solution


class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i =0 ; i < numbers.length; i++){
            sb.append(numbers[i]);
        }
        sb.insert(0, "(");
        sb.insert(4, ")");
        sb.insert(5, " ");
        sb.insert(9, "-");

        return sb.toString();
    }
}


