class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0 || preorder.length == 0) return null;
        int val = preorder[0];
        TreeNode root = new TreeNode(val);
        int inorderIdx = 0;
        for(int i = 0;i < inorder.length ; i++){
            if(inorder[i] == val) {
                inorderIdx = i; 
                break;
            }
        }
        int[] leftInorder = Arrays.copyOfRange(inorder,0,inorderIdx);
        int[] rightInorder = Arrays.copyOfRange(inorder,inorderIdx + 1,inorder.length);
                                         
        int[] leftPreorder = Arrays.copyOfRange(preorder,1,leftInorder.length+1);
        int[] rightPreorder = Arrays.copyOfRange(preorder,inorderIdx+1,preorder.length);

        root.left = buildTree(leftPreorder,leftInorder);
        root.right = buildTree(rightPreorder,rightInorder);

        return root;
    }
}