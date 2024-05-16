/*
Instructions
Output
Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"
*/

//Solution


public class SpinWords {

    public String spinWords(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        for(int i = 0; i < sentenceArray.length; i++){
            if (sentenceArray[i].length() >= 5){
            StringBuilder sb = new StringBuilder();
            String reversedWord = sb.append(sentenceArray[i]).reverse().toString();
            sentenceArray[i] = reversedWord;
            }
        }
        String solution = String.join(" ", sentenceArray);
        return solution;
    }
}