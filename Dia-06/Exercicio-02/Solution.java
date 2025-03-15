class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fastHead = head;
        while(fastHead != null && fastHead.next != null){
            fastHead = fastHead.next.next;
            head = head.next;
        }
        return head;
    }
}