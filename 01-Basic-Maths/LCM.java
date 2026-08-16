/*
 * Problem: Find LCM of Two Numbers
 *
 * Approach:
 * Start from the larger of the two numbers.
 * Check its multiples until a number divisible by both
 * n1 and n2 is found.
 *
 * Time Complexity: O(max(n1, n2))
 * Space Complexity: O(1)
 */

class Solution {
    public int LCM(int n1, int n2) {
        int lcm;

        int n = Math.max(n1, n2);
        int i = 1;

        while (true) {
            int mul = n * i;

            if (mul % n1 == 0 && mul % n2 == 0) {
                lcm = mul;
                break;
            }

            i++;
        }

        return lcm;
    }
}
