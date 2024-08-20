/*

https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
DESCRIPTION:
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
*/

//Solution




import java.util.ArrayList;
import java.util.List;

 class Kata1 {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> justIntegers = new ArrayList<Object>();

        if(list == null){
            return null;

        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Integer){
                justIntegers.add((Integer) list.get(i));
            }
        }
        return justIntegers;
    }
}
