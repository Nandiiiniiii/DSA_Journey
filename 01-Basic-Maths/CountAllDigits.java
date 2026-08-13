/*
 * Problem: Count All Digits of a Number
 *
 * Approach:
 * Repeatedly divide the number by 10.
 * Each division removes one digit, so we increment the count.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */

class Solution {
    public int countDigit(int n) {
        int c = 0;

        if (n == 0)
            return 1;

        while (n > 0) {
            n = n / 10;
            c++;
        }

        return c;
    }
}
