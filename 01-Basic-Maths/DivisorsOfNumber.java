import java.util.Arrays;

/*
 * Problem: Find All Divisors of a Number
 *
 * Approach:
 * Traverse from 1 to n and check which numbers divide n completely.
 * Store the divisors in an array and return only the filled portion.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] divisors(int n) {
        int[] t = new int[n];
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                t[k++] = i;
            }
        }

        return Arrays.copyOf(t, k);
    }
}
