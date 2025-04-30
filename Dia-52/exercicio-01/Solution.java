class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;

        int middle = nums[nums.length/2];
        TreeNode node = new TreeNode(middle);
        
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums,(nums.length/2) + 1,nums.length));

        return node;
    }
}