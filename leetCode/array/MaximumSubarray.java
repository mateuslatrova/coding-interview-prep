public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        
        int currentSum = nums[0];
        int maxSum = currentSum;

        for (int i = 1; i < nums.length - 1; i++) {
            if (currentSum + nums[i] > maxSum) maxSum
            
        }
    }
}