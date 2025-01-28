import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int target) {
        List<Boolean> result = new ArrayList<>();
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i] + target >= maxNum);
        }

        return result;
    }
}
