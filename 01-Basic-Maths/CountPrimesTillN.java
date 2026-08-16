/*
 * Problem: Count Prime Numbers Till N
 *
 * Approach:
 * Check every number from 2 to n-1.
 * For each number, check whether it has any divisor other than 1 and itself.
 * If it has no divisor, count it as a prime number.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int primeUptoN(int n) {
        int c = 0;

        for (int i = 2; i < n; i++) {
            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                c++;
            }
        }

        return c;
    }
}
