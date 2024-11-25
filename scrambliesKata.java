import java.util.ArrayList;

class Snail {

    public static int[] snail(int[][] array) {

        int n = array.length;
        ArrayList<Integer> sortedSolution = new ArrayList<>();

        int r = 0;
        int c = 0;

        array[r][c] = -1; // Mark the starting point as visited
        String direction = "right";

        while (c >= 0 && r >= 0 && c < n && r < n) {
            if (array[r][c] == -1) break; // Stop if the current cell is visited
            sortedSolution.add(array[r][c]); // Add the current element to the solution
            array[r][c] = -1; // Mark the current cell as visited

            // Move and change direction if necessary
            switch (direction) {
                case "right":
                    c++;
                    if (c >= n || array[r][c] == -1) { // If we hit the boundary or a visited cell
                        direction = "down";
                        c--; // Move back
                        r++; // Move down
                    }
                    break;

                case "down":
                    r++;
                    if (r >= n || array[r][c] == -1) { // If we hit the boundary or a visited cell
                        direction = "left";
                        r--; // Move back
                        c--; // Move left
                    }
                    break;

                case "left":
                    c--;
                    if (c < 0 || array[r][c] == -1) { // If we hit the boundary or a visited cell
                        direction = "up";
                        c++; // Move back
                        r--; // Move up
                    }
                    break;

                case "up":
                    r--;
                    if (r < 0 || array[r][c] == -1) { // If we hit the boundary or a visited cell
                        direction = "right";
                        r++; // Move back
                        c++; // Move right
                    }
                    break;

                default:
                    direction = "Invalid Direction";
            }
        }

        // Convert the ArrayList to an int[] array
        int[] solution = new int[sortedSolution.size()];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = sortedSolution.get(i); // Fill the array with values from ArrayList
        }

        return solution;
    }

    public static void main(String[] args) {
        // Test with a simple array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = snail(array);
        for (int num : result) {
            System.out.print(num + " "); // Print the result
        }
    }
}
