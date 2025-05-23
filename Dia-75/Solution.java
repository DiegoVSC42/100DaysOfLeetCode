class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushLeftNodes(root);
    }

    private void pushLeftNodes(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode nextNode = stack.pop();
        if (nextNode.right != null) 
            pushLeftNodes(nextNode.right);
        return nextNode.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
