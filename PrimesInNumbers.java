/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

*/

//Solution



import java.util.Map;
import java.util.TreeMap;

class PrimeDecomp {
    public static String factors(int n) {
        Map<Integer, Integer> primeFactors = new TreeMap<>();

        // Check divisors starting from 2
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }


        if (n > 1) {
            primeFactors.put(n, 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int prime = entry.getKey();
            int count = entry.getValue();
            result.append("(").append(prime);
            if (count > 1) {
                result.append("**").append(count);
            }
            result.append(")");
        }

        return result.toString();
    }

}
