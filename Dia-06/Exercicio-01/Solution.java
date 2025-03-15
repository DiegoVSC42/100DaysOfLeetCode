class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reversedList = null;
        ListNode nextNode = new ListNode();
        while(head != null){
            nextNode = head.next;
            head.next = reversedList;
            reversedList = head;
            head = nextNode;
        }
        
        return reversedList;
        
    }
}