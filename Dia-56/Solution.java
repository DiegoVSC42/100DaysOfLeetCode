class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;

        int val = postorder[postorder.length-1];
        TreeNode root = new TreeNode(val); 

        int inorderIdx = 0;
        for(int i = 0;i < inorder.length ; i++){
            if(inorder[i] == val) inorderIdx = i; 
        }
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, inorderIdx);
        int[] rightInorder = Arrays.copyOfRange(inorder, inorderIdx + 1, inorder.length);

        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, leftInorder.length);
        int[] rightPostorder = Arrays.copyOfRange(postorder, leftInorder.length, postorder.length - 1); 
        
        root.left = buildTree(leftInorder, leftPostorder);
        root.right = buildTree(rightInorder, rightPostorder);

        return root;
    }
}