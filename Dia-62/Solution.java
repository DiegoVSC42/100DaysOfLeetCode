class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(invertTree(root.left),root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null ) return root;
        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;
        invertTree(root.left);
        invertTree(root.right);
        return root;
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