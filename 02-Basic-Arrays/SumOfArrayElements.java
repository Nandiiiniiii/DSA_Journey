/*
 * Problem: Sum of Array Elements
 *
 * Approach:
 * ...
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> s =new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
        s.add(solve(i));
        }
        return s;

    }
    public List<Integer> solve(int r)
    {
        List<Integer> s=new ArrayList<>();
        int res=1;
        s.add(1);
        for(int i=1;i<r;i++)
        {
            res=res*(r-i);
            res=res/i;
            s.add((int)res);
        }
        return s;
    }
}
