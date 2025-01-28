class Solution {
    static List<Integer> ans;

    private void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        postorder(root);
        return ans;
    }
}