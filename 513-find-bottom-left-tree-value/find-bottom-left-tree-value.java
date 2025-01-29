class Solution {
    private int maxdepth=-1;
    private int leftmost;
    public void traverse(TreeNode root , int depth){
        if(root==null) return;
        if(depth>maxdepth){
            maxdepth=depth;
            leftmost=root.val;
        }
        traverse(root.left , depth+1);
        traverse(root.right , depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        leftmost=root.val;
        traverse(root , 0);
        return leftmost;
    }
}