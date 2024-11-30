/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
*/

//Solution



public class SquareDigit {

    public int squareDigits(int n) {
        String nString = n + "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nString.length();  i++){

            char charDigit = nString.charAt(i);
            String charString = Character.toString(charDigit);
            int  intDigit = Integer.parseInt(charString);
            int squareOfDigit = intDigit * intDigit;

            String squareOfDigitString = squareOfDigit + "";
            sb.append(squareOfDigitString);
        }
        String solutionString = sb.toString();
        int solution = Integer.parseInt(solutionString);
        return  solution;
    }
}


// Solution Refactored

public class SquareDigit {

    public int squareDigits(int n) {
        String nString = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nString.length(); i++){
            int digit = Character.getNumericValue(nString.charAt(i));
            sb.append(digit * digit);
        }
        String solution = sb.toString();

        return Integer.parseInt(solution);
    }
}
