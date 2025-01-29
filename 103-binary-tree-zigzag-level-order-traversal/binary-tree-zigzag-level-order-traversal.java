class Solution {
    public int levels(TreeNode root){
        if(root==null ) return 0;
        return 1+Math.max(levels(root.left) , levels(root.right));
    }
    public void traverse(TreeNode root , int level , int lvl , List<Integer> arr){
        if(root==null) return;
        if(level==lvl) {
            if(lvl%2 == 0) arr.add(root.val);
            else arr.add(0,root.val);
        }
        traverse(root.left , level+1 , lvl , arr);
        traverse(root.right , level+1 , lvl , arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        int lvl = levels(root);
        for(int i=0;i<=lvl-1;i++){
            List<Integer> arr = new ArrayList<>();
            traverse(root , 0 , i , arr);
            ans.add(arr);
        }
        return ans;
    }
}
//leetcode test