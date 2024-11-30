/*

https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
*/

//SOLUTION USING VECTORS


 class Snail1 {
    public static int[] snail(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [] result = new int[rows * cols];

        // Direction vectors for right, down, left, and up
        // A good way to visualize the next to lines is
        // looking the values as pairs (0,1) (1,0) (0,-1) (-1,0)

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        boolean[][] visited = new boolean[rows][cols];
        int r = 0, c = 0, dir = 0; // Starting position and direction

        for (int i = 0; i < rows * cols; i++) {
            result[i] = (matrix[r][c]);
            visited[r][c] = true;

            // Calculate the next position
            int nextR = r + dr[dir];
            int nextC = c + dc[dir];

            // Check if the next position is valid
            if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols && !visited[nextR][nextC]) {
                r = nextR;
                c = nextC;
            } else {
                // Change direction
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }
        }

        return result;
    }


}

//SOLUTION USING SWITCH

class SnailSortWithSwitch {
    public static int[] snail(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        boolean[][] visited = new boolean[rows][cols];

        int r = 0, c = 0;
        String direction = "right";

        for (int i = 0; i < rows * cols; i++) {
            result[i] = matrix[r][c];
            visited[r][c] = true;


            int nextR = r, nextC = c;
            switch (direction) {
                case "up":    nextR--; break;
                case "down":  nextR++; break;
                case "left":  nextC--; break;
                case "right": nextC++; break;
            }

            // Check if the next position is valid
            if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols && !visited[nextR][nextC]) {
                r = nextR;
                c = nextC;
            } else {
                // Change direction
                direction = getNextDirection(direction);
                switch (direction) {
                    case "up":    r--; break;
                    case "down":  r++; break;
                    case "left":  c--; break;
                    case "right": c++; break;
                }
            }
        }

        return result;
    }

    private static String getNextDirection(String currentDirection) {
        switch (currentDirection) {
            case "right": return "down";
            case "down":  return "left";
            case "left":  return "up";
            case "up":    return "right";
            default:      return "right";
        }
    }
}
