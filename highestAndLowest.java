/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

*/

//Solution

public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] numbersArrayString = numbers.split(" ");
        int max = Integer.parseInt(numbersArrayString[0]);
        int min = Integer.parseInt(numbersArrayString[0]);

        for(String element : numbersArrayString){

            int num = Integer.parseInt(element);
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }

        }

        String solution = max + " " + min;
        return solution;
    }
}