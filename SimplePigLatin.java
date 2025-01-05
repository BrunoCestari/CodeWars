/*
https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/

//Solution


//REFACTORE SOLUTION
class PigLatin {
    public static String pigIt(String str) {
        String[] arr = str.trim().split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            if (!word.equals("!") && !word.equals(".") && !word.equals("?") && !word.equals("...")) {
                StringBuilder sb = new StringBuilder();
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
                sb.append("ay");

                arr[i] = sb.toString();
            }
        }

        return String.join(" ", arr);
    }
}



//




//FIRST SOLUTION

//class PigLatin {
//    public static String pigIt(String str) {
//        // Write code here
//        String[] arr = str.trim().split(" ");
//
//
//
//
//        int i = 0;
//        for(String word : arr){
//            StringBuilder sb = new StringBuilder();
//            if(!word.equals("!") && !word.equals(".")  && !word.equals("?")  && !word.equals("...") ){
//                String substring = word.substring(1);
//                sb.append(substring);
//                sb.append(word.charAt(0));
//                sb.append("ay");
//                arr[i] = sb.toString();
//                i++;
//            }
//        }
//        return String.join(" ", arr);
//    }
//}