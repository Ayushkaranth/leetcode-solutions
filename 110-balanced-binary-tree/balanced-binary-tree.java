class Solution {
    public int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.right), level(root.left));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(level(root.right) - level(root.left)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
