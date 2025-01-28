class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        // Step 1: Place each element in its correct position using cyclic sort
        for (int i = 0; i < n; i++) {
            // Place nums[i] at its correct position if it's not already there
            while (nums[i] != nums[nums[i] - 1]) {
                swap(i, nums[i] - 1, nums);
            }
        }

        // Step 2: Collect all the numbers which are not in the correct position
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    }
}
