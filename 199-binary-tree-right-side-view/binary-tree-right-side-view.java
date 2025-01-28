class Solution {
    int maxlevel=-1;
     public int levels(TreeNode root){
        if(root==null ) return 0;
        return 1+Math.max(levels(root.left) , levels(root.right));
    }
    public void traverse(TreeNode root , int level , List<Integer> ans){
        if(root == null) return ;
        if(level>maxlevel){
            ans.add(root.val);
            maxlevel=level;
        }
        traverse(root.right ,level+1,ans);
        traverse(root.left ,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(root , 0 , ans);
        return ans;
    }
}

//testing for leetcode