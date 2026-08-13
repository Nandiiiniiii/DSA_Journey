/*
 * Problem: Reverse a Number
 *
 * Approach:
 * Extract the last digit using n % 10 and add it to the reversed number.
 * Remove the last digit using n / 10.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */

class Solution {
    public int reverseNumber(int n) {
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return rev;
    }
}
