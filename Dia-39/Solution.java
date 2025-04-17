class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode end = head;
        while(end != null && end.next != null){
            mid = mid.next;
            end = end.next.next;
        }
        ListNode reversedList = null;
        ListNode nextNode = new ListNode();
        while(mid != null){
            nextNode = mid.next;
            mid.next = reversedList;
            reversedList = mid;
            mid = nextNode;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = reversedList;
        while(secondHalf.next != null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}