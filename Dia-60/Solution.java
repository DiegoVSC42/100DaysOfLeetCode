class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        createSortedList(root,result);
        return result.get(k-1);
    }
    public void createSortedList(TreeNode node, List<Integer> result){
        if(node == null) return;
        createSortedList(node.left,result);
        result.add(node.val);
        createSortedList(node.right,result);
    }
}