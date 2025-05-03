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