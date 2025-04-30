// Sorted Array
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

// Sorted List

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode start = head;
        ListNode mid = head;
        ListNode end = head;

        ListNode prev = null;
        while(end != null && end.next != null){
            prev = mid;
            mid = mid.next;
            end = end.next.next;
        }
        prev.next = null;

        TreeNode node = new TreeNode(mid.val);
        node.left = sortedListToBST(start);
        node.right = sortedListToBST(mid.next);
        
        return node;
    }
}