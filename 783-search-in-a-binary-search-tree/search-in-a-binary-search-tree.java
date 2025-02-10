class Solution {
    public TreeNode display(TreeNode root) {
        return root; // Just return the root node itself
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return display(root); // Return the found node
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
