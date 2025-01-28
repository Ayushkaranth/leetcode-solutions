import java.util.ArrayList;
import java.util.List;

public class Solution {  // Rename the class to "Solution"
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Explore further elements to be added to the current subset
        for (int i = index; i < nums.length; i++) {
            // Include nums[i] in the subset
            current.add(nums[i]);
            // Recur with the next element
            generateSubsets(i + 1, nums, current, result);
            // Backtrack: remove the last element added
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        System.out.println(subsets);
    }
}
