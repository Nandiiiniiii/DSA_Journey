/*
 * Problem: Find GCD of Two Numbers
 *
 * Approach:
 * Start checking from the larger of the two numbers.
 * The first number that divides both numbers is their GCD.
 *
 * Time Complexity: O(max(n1, n2))
 * Space Complexity: O(1)
 */

class Solution {
    public int GCD(int n1, int n2) {
        int c = 1;
        int max = Math.max(n1, n2);

        for (int i = max; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                c = i;
                break;
            }
        }

        return c;
    }
}
