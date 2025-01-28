class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

 
        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(i, nums[i] - 1, nums);
            }
        }

    
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                result[0] = nums[i]; 
                result[1] = i + 1;    
                break;
            }
        }

        return result;
    }
}
