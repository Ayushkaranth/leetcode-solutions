import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // Iterate through the sorted array and check for consecutive duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            // If two consecutive elements are the same, a duplicate is found
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // If no duplicates are found, return false
        return false;
    }
}
