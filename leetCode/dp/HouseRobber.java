// Problem: https://leetcode.com/problems/house-robber/

package leetcode.dp;

public class HouseRobber {
    
    // Recursive Solution:
    public int robRecursive(int[] nums, int i) {
        if (i < 0 || i >= nums.length) return 0;
        return Math.max(nums[i]+robRecursive(nums,i+2), robRecursive(nums, i+1));
    }
    
    public int robRec(int[] nums) {
        return robRecursive(nums, 0);
    }

    // DP solution:
    public int robDP(int[] nums) {

        int n = nums.length;
        int[] max = new int[n+2];
        
        // Bottom-up approach:
        for (int i = n-1; i >= 0; i--) 
            max[i] = Math.max(nums[i]+max[i+2], max[i+1]);
        
        return max[0];
    }

}
