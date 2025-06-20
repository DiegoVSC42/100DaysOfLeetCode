class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(queue.size() > 0){
            List<Integer> currentLevel = new ArrayList<>();
            int levelSize = queue.size();
            for(int i = 0 ; i < levelSize ; i++){
                TreeNode node = queue.pollFirst();
                currentLevel.add(node.val);
                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);
            }
            result.add(currentLevel.get(currentLevel.size()-1));
        }
        return result;
    }
}