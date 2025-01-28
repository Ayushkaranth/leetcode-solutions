import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        // Sort the array to process the smallest elements first
        Arrays.sort(nums);
        
        int operations = 0; // To count the number of operations needed

        // Iterate through the sorted array
        for (int num : nums) {
            if (num < k) {
                operations++; // Increment operation count for each element less than k
            } else {
                break; // Stop when we reach elements greater than or equal to k
            }
        }

        return operations; // Return the total operations needed
    }
}
//leetcode