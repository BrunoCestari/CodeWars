/*
https://www.codewars.com/kata/5839c48f0cf94640a20001d3/train/java/674f927df620f14ae2a089ab
DESCRIPTION:
Given an array arr of strings, complete the function by calculating the total perimeter of all the islands. Each piece of land will be marked with 'X' while the water fields are represented as 'O'. Consider each tile being a perfect 1 x 1 piece of land. Some examples for better visualization:

['XOOXO',
 'XOOXO',
 'OOOXO',
 'XXOXO',
 'OXOOO']
*/

//Solution

class LandPerimiter {

    public static String landPerimeter(String[] arr) {
        int rows = arr.length;
        int cols = arr[0].length();

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i].charAt(j) == 'X') {

                    // Check top
                    if (i == 0 || arr[i - 1].charAt(j) != 'X') count++;

                    // Check bottom
                    if (i == rows - 1 || arr[i + 1].charAt(j) != 'X') count++;

                    // Check left
                    if (j == 0 || arr[i].charAt(j - 1) != 'X') count++;

                    // Check right
                    if (j == cols - 1 || arr[i].charAt(j + 1) != 'X') count++;
                }
            }
        }

        return "Total land perimeter: " + count;
    }
}
