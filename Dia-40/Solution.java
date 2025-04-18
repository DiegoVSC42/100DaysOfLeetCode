class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode aux = newHead;
        while(aux.next != null && aux.next.next != null){

            ListNode first = aux.next;
            ListNode second = aux.next.next;
            
            first.next = second.next;
            second.next = first;
            aux.next = second;
            
            aux = aux.next.next;
        }
        return newHead.next;
    }
}