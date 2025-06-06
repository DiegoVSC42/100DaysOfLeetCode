//Leaf-Similar trees

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafValues1 = new ArrayList<>();
        List<Integer> leafValues2 = new ArrayList<>();
        findLeaves(root1,leafValues1);
        findLeaves(root2,leafValues2);
        return leafValues1.equals(leafValues2);

    }
    public void findLeaves(TreeNode root, List<Integer> leafList){
        if(root == null) return;
        if(root.left == null && root.right == null)
            leafList.add(root.val);
        findLeaves(root.left,leafList);
        findLeaves(root.right,leafList);
    }
}

// Search in a binary search tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        TreeNode left = searchBST(root.left,val);
        if(left != null) return left;
        TreeNode right = searchBST(root.right,val);
        return right;
    }
}

// Binary Tree Right Side View

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