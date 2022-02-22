// Problem: https://leetcode.com/problems/two-sum/
import java.util.HashMap;

class TwoSum {
    // Brute force approach
    public int[] twoSum1(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }

    // Using hash map:
    public int[] twoSum2(int[] nums, int target) {
        
        int[] ans = new int[2];
        HashMap<Integer,Integer> processedNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (processedNums.containsKey(complement)) {
                ans[0] = i;
                ans[1] = processedNums.get(complement);
                break;
            } else {
                processedNums.put(nums[i],i);
            }
        }

        return ans;
    }
}

