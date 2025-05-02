class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        int result = 0;
        while(queue.size() > 0){
            int currentLevel = queue.size();
            for(int i = 0 ; i < currentLevel ; i++){
                TreeNode node = queue.pollFirst();
                if(node.left != null)
                    queue.addLast(node.left);
                if(node.right != null)
                    queue.addLast(node.right);
            }
            result++;
        }
        return result;
    }
}