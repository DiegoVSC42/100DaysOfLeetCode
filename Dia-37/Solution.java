class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(); newHead.next = head;
        ListNode current = head;         
        ListNode previous = newHead;
        while(current != null){
            if(current.val == val){
                previous.next = previous.next.next;
            }else{
                previous = previous.next;
            }
            current = current.next;
        }
        return newHead.next;
    }
}