/*
https://www.codewars.com/kata/526989a41034285187000de4/train/java
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
* With input "10.0.0.0", "10.0.0.50"  => return   50
* With input "10.0.0.0", "10.0.1.0"   => return  256
* With input "20.0.0.10", "20.0.1.0"  => return  246
*/

//Solution
class CountIPAddresses {

    public static long ipsBetween(String start, String end) {

        String[] endArr = end.split("\\.");
        String[] startArr = start.split("\\.");

        long endLong =
                        (long) (Integer.parseInt(endArr[0]) * Math.pow(256, 3)) +
                        (long) (Integer.parseInt(endArr[1]) * Math.pow(256, 2)) +
                        (long) (Integer.parseInt(endArr[2]) * Math.pow(256, 1)) +
                        (long) (Integer.parseInt(endArr[3]) * Math.pow(256, 0));

        long startLong =
                        (long) (Integer.parseInt(startArr[0]) * Math.pow(256, 3)) +
                        (long) (Integer.parseInt(startArr[1]) * Math.pow(256, 2)) +
                        (long) (Integer.parseInt(startArr[2]) * Math.pow(256, 1)) +
                        (long) (Integer.parseInt(startArr[3]) * Math.pow(256, 0));


        return endLong - startLong;
    }
}

