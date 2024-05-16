/*
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
*/

//Solution




public class DescendingOrder {

    //This solution uses Bubble Sort Algorithm

    public static int sortDesc(final int num) {

        String numString = Integer.toString(num);

        int[] digitArray =  new int[numString.length()];

        //storing the values of each digit in the array

        for (int i = 0; i < numString.length(); i++){
            digitArray[i] = Character.getNumericValue(numString.charAt(i));
        }

        // sorting the array in descending order

        for (int i = 0; i < digitArray.length - 1; i++) {
            for (int j = 0; j < digitArray.length - 1 - i; j++) {
                if (digitArray[j] < digitArray[j+1]) {
                    // Swap elements
                    int temp = digitArray[j];
                    digitArray[j] = digitArray[j+1];
                    digitArray[j+1] = temp;
                }
            }
        }

        StringBuilder solution = new StringBuilder();
        for (int digit : digitArray){
            solution.append(digit);
        }
        return Integer.parseInt(solution.toString());
    }
}


//The above solution is brute force. I wasted to many time discovering it by myself.




