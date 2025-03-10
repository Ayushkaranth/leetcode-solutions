class Solution {
    static List<Integer> ans;

    private void preorder(TreeNode root){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        preorder(root);
        return ans;
    }
}