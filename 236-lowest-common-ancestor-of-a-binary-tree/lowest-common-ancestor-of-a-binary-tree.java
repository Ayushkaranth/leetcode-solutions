class Solution {
    public boolean exists(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return exists(root.left, node) || exists(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root) return root;
        boolean pLiesInLST = exists(root.left, p);
        boolean qLiesInLST = exists(root.left, q);
        if (pLiesInLST == true && qLiesInLST == true) return lowestCommonAncestor(root.left, p, q);
        if (pLiesInLST == false && qLiesInLST == false) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}