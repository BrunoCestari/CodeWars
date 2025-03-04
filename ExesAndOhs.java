/*

https://www.codewars.com/kata/55908aad6620c066bc00002a/java

DESCRIPTION:
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

//Solution



class XO {

    public static boolean getXO (String str) {

        // Good Luck!!
        str = str.trim().toLowerCase();

        int xCount = 0;
        int oCount = 0;

        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'x': xCount++;
                break;
                case 'o': oCount++;
                break;

            }
        }

        return xCount == oCount;
    }
}