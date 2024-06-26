/*
DESCRIPTION:
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.
*/

//Solution

class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here

        String solution = "";

        if (names == null || names.length == 0) {
            solution = "no one likes this";
        } else if (names.length == 1) {
            solution = names[0] + " likes this";
        } else if (names.length == 2) {
            solution = names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            solution = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }else{
            solution =  names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2 ) + " others like this";
        }

        return solution;
    }

}

