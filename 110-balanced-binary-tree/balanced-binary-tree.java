class Solution {
    public int level(TreeNode root) {
        if (root == null) return 0;
        
        int left = level(root.left);
        int right = level(root.right);
        
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return level(root) != -1;
    }
}