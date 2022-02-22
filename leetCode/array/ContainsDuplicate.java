// Problem: https://leetcode.com/problems/contains-duplicate/

import java.util.HashMap;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> numFrequency = new HashMap<>();
        boolean duplicate = false;

        for (int num: nums) {
            if (!numFrequency.containsKey(num))
                numFrequency.put(num, 1);
            else {
                duplicate = true;
                break;
            }
        }

        return duplicate;
    }
}
