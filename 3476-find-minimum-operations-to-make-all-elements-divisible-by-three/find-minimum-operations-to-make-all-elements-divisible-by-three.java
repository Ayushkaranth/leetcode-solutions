class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                count += 0; // No operation needed
            } else if ((nums[i] + 1) % 3 == 0) {
                count++; // Increment count for +1 operation
            } else if ((nums[i] - 1) % 3 == 0) {
                count++; // Increment count for -1 operation
            }
        }
        return count;
    }
}
//leetcode
