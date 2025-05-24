class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) 
            slow = slow.next;

        while (slow != null) {
            if (stack.pop() != slow.val) 
                return false;
            slow = slow.next;
        }

        return true;
    }
}
