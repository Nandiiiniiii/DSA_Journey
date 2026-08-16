/*
 * Problem: Check for Perfect Number
 *
 * Approach:
 * Find all proper divisors of n and calculate their sum.
 * If the sum of the proper divisors equals n, it is a perfect number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n == sum)
            return true;
        else
            return false;
    }
}
