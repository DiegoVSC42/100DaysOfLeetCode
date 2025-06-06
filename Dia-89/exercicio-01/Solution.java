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