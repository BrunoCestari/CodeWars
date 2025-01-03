/*

https://www.codewars.com/kata/52fb87703c1351ebd200081f/train/java
Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.

Examples
"1999" --> "20th"
"2011" --> "21st"
"2154" --> "22nd"
"2259" --> "23rd"
"1124" --> "12th"
"2000" --> "20th"

*/

//REFACTOR Solution

public class Solution{
    public static String whatCentury(int year) {
        int century = (year + 99) / 100;  // Calculate century

        // Determine suffix based on century
        String suffix;
        if (century % 10 == 1 && century % 100 != 11) {
            suffix = "st";
        } else if (century % 10 == 2 && century % 100 != 12) {
            suffix = "nd";
        } else if (century % 10 == 3 && century % 100 != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        return century + suffix;
    }
}



//public class Solution{
//    public static String whatCentury(int year) {
//        // coding here
//        String yearString = Integer.toString(year);
//        char[] arr = yearString.toCharArray();
//
//        if(arr[2] == '0' && arr[3] == '0'){
//
//            return String.valueOf(arr[0])  + String.valueOf(arr[1]) + "th";
//        }
//
//        String s = String.valueOf(arr[0]) + String.valueOf(arr[1]);
//
//        String solution = Integer.toString( Integer.parseInt(s) +1) + "th";
//
//        int lastThreedigits = Integer.parseInt(Integer.toString(year).substring(1));
//
//        if(year >= 1001 && year <= 1300){
//            return solution;
//        }
//
//        if(lastThreedigits >= 001 && lastThreedigits <=100){
//            solution = solution.replace("th", "st");
//        }
//
//        if(lastThreedigits >= 101 && lastThreedigits <=200){
//            solution=  solution.replace("th", "nd");
//        }
//        if(lastThreedigits >= 201 && lastThreedigits <=300){
//            solution = solution.replace("th", "rd");
//        }
//        return solution;
//
//    }
//}

