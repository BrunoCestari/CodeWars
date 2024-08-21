/*

https://www.codewars.com/kata/5b55c49d4a317adff500015f/train/java

You have the radius of a circle with the center in point (0,0).

Write a function that calculates the number of points in the circle where (x,y) - the cartesian coordinates of the points - are integers.

Example: for radius = 2 the result should be 13.

0 <= radius <= 1000
*/

//Solution


import java.util.ArrayList;
import java.util.HashSet;

class Kata {
    public static int pointsNumber(int radius) {

        ArrayList<int[]> arrayList = new ArrayList<>();

        //your code
        for(int x = -radius; x <= radius;  x++){
            for(int y = -radius; y <= radius;  y++){
                int[] point = new int[]{x,y};

                if(!arrayList.contains(point) && Math.sqrt(x * x + y * y) <= radius){
                arrayList.add(new int[]{x,y});
            }
     }

    }   return arrayList.size();
}
}


