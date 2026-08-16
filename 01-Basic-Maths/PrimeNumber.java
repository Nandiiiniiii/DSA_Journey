/*
 * Problem: Check for Prime Number
 *
 * Approach:
 * Check whether the number is divisible by any number
 * from 2 to n-1. If it is divisible, it is not prime.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPrime(int n) {
        if (n == 1)
            return false;

        int flag = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return true;
        else
            return false;
    }
}
