/*
My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:

"100 180 90 56 65 74 68 86 99"
When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:

180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.

Notes
it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
For C: The result is freed.
*/

//Solution

import java.util.*;

class WeightSort {

    // Helper function to get the weights
    public static int getWeight(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public static String orderWeight(String strng) {

        // Clean the input
        String cleanedStrng = strng.trim().replaceAll("\\s+", " ");

        // Create the array with the numbers
        String[] arr = cleanedStrng.split(" ");

        Map<Integer, List<String>> map = new TreeMap<>();

        for(String number : arr){
            int weight = getWeight(number);

            if(map.containsKey(weight)){
                List<String> list = map.get(weight);
                list.add(number);
                Collections.sort(list);

            }else{
                List<String> newList = new ArrayList<>();
                newList.add(number);
                map.put(weight, newList );
            }

        }

        StringBuilder sb = new StringBuilder();
        for (List<String> list : map.values()) {
            for (String number : list) {
                sb.append(number).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
