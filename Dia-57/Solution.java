class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        boolean node = isSameTree(root,subRoot);
        boolean left  = isSubtree(root.left,subRoot);
        boolean right = isSubtree(root.right,subRoot);
        return left || right || node;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null && q != null || q == null && p != null) return false;
        boolean left = true,right = true;
        if(p.val == q.val){
            left = isSameTree(p.left,q.left);
            right = isSameTree(p.right,q.right);
            return left && right;
        }
        return false;
    }
}