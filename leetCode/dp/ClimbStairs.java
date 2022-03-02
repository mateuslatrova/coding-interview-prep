// Problem: https://leetcode.com/problems/climbing-stairs/

package leetcode.dp;

public class ClimbStairs {
    
    // Recursive:
    public int climbStairsRecursive(int n) {

        if (n == 0 || n == 1)
            return 1;
        
        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
    }

    // DP:
    public int climbStairsDP(int n) {
        
        int[] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++)
            memo[i] = memo[i-1] + memo[i-2];
            
        return memo[n];
    }
}
