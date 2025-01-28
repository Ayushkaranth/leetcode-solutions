class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    // Merge sort function to sort and count reverse pairs
    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        
        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        
        // Count the important reverse pairs across the two halves
        count += countPairs(nums, left, mid, right);
        
        // Merge the two sorted halves
        merge(nums, left, mid, right);
        
        return count;
    }

    // Function to count reverse pairs between two halves
    private int countPairs(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {
            // Find how many nums[j] satisfy nums[i] > 2 * nums[j]
            while (j <= right && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        return count;
    }

    // Merge two sorted subarrays
    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge elements from both halves into a temporary array
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from the right half
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy sorted elements back into the original array
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}
