/*
 * Problem: Count Number of Odd Digits in a Number
 *
 * Approach:
 * Extract each digit using n % 10.
 * Check whether the digit is odd and increment the count.
 * Remove the last digit using n / 10.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */

class Solution {
    public int countOddDigit(int n) {
        int c = 0;

        while (n > 0) {
            int d = n % 10;

            if (d % 2 != 0) {
                c++;
            }

            n = n / 10;
        }

        return c;
    }
}
