/*

https://www.codewars.com/kata/5b55c49d4a317adff500015f/train/java

You have the radius of a circle with the center in point (0,0).

Write a function that calculates the number of points in the circle where (x,y) - the cartesian coordinates of the points - are integers.

Example: for radius = 2 the result should be 13.

0 <= radius <= 1000
*/

//Solution



class XO {

    public static boolean getXO (String str) {

        // Good Luck!!
        str = str.trim().toLowerCase();

        int xCount = 0;
        int oCount = 0;

        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'x': xCount++;
                break;
                case 'o': oCount++;
                break;

            }
        }

        return xCount == oCount;
    }
}