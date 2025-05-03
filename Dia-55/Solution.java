// Is Balanced

class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    public int checkHeight(TreeNode node){
        if(node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if(leftHeight == -1) return -1;
        int rightHeight = checkHeight(node.right);
        if(rightHeight == -1) return -1;
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight,rightHeight) + 1;
    }
}

// Min Depth

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        int level = 1;
        while(queue.size() > 0){
            int currentLevelValues = queue.size();
            for(int i = 0 ; i < currentLevelValues ; i++){
                TreeNode node = queue.pollFirst();
                if(node.left == null && node.right == null)
                    return level;
                if(node.left != null)
                    queue.addLast(node.left);
                if(node.right != null)
                    queue.addLast(node.right);
            }
            level++;
        }
        return level;
    }
}