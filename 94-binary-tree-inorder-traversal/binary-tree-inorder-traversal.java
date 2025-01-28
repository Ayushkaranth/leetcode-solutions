class Solution {
    static List<Integer> ans;

    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
         ans.add(root.val);
        inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        inorder(root);
        return ans;
    }
}