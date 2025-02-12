/*
https://www.codewars.com/kata/55b42574ff091733d900002f/train/java

Make a program that filters a list of strings and returns a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

Input = ["Ryan", "Kieran", "Jason", "Yous"]
Output = ["Ryan", "Yous"]

Input = ["Peter", "Stephen", "Joe"]
Output = []
*/

//Solution


import java.util.ArrayList;
import java.util.List;
class Kata {
    public static List<String> friend(List<String> x){
        // Your code here
        List<String> friends = new ArrayList<>();

        for(String person : x){
            if(person.length() == 4){
                friends.add(person);
            }
        }
        return friends;
    }
}