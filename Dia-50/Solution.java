// Pré ordem
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;
    }
    public void preorder(TreeNode node,List<Integer> result){
        if(node != null){
            result.add(node.val);
            preorder(node.left,result);
            preorder(node.right,result);
        }
    }
}

// Em ordem
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode node,List<Integer> result){
        if(node != null){
            inorder(node.left,result);
            result.add(node.val);
            inorder(node.right,result);
        }
    }
}

// Pós ordem
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public void postorder(TreeNode node,List<Integer> result){
        if(node != null){
            postorder(node.left,result);
            postorder(node.right,result);
            result.add(node.val);
        }
    }
}