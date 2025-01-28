class Solution {
    public boolean path(TreeNode root, int s, int sum) {
        if (root == null) return false;
        
        s += root.val;
        
        if (root.left == null && root.right == null) {
            return s == sum;
        }
        
        return path(root.left, s, sum) || path(root.right, s, sum);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root, 0, targetSum);
    }
}
