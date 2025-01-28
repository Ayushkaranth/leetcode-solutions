class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0; // To store the maximum frequency found
        int sumMaxFrequencies = 0; // To store the sum of maximum frequencies
        
        // To keep track of whether an element's frequency has been added to the sum
        boolean[] counted = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (counted[i]) continue; // Skip if this number has already been processed

            int frequency = 0; // Reset frequency for each new element

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    frequency++; // Increment frequency when a match is found
                }
            }

            // Check if current frequency matches the max frequency
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                sumMaxFrequencies = frequency; // Reset sum to the new max frequency
            } else if (frequency == maxFrequency) {
                sumMaxFrequencies += frequency; // Add current max frequency to sum
            }

            // Mark this element as processed
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counted[j] = true; // Mark all occurrences of this element
                }
            }
        }

        return sumMaxFrequencies; // Return the sum of the highest frequencies
    }
}
//leetcode
