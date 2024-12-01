/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""


*/

//Solution


// TreeMap way

import java.util.TreeMap;

class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (String word : wordsArray) {
            String numberString = word.replaceAll("(?i)[^123456789]", "");
            int number = Integer.parseInt(numberString);
            treeMap.put(number, word);

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= treeMap.size(); i++) {
            sb.append(treeMap.get(i));
            if (i < treeMap.size()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

// A BETTER SOLUTION: ARRAY WAY

 class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split(" ");

        String[] sortedWords = new String[wordsArray.length];

        for (String word : wordsArray) {
            int number = Integer.parseInt(word.replaceAll("[^1-9]", ""));
            sortedWords[number - 1] = word;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sortedWords.length; i++) {
            sb.append(sortedWords[i]);
            // Append a space only if it's not the last element
            if (i < sortedWords.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}



