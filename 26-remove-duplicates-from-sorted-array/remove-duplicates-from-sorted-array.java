class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle the edge case when the array is empty
        }

        // Initialize the index for the last unique element
        int uniqueIndex = 0;

        // Start from the second element and compare with the last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next position for a unique element
                nums[uniqueIndex] = nums[i]; // Update the position with the new unique element
            }
        }

        // Return the length of the array with unique elements
        return uniqueIndex + 1;
    }
}
