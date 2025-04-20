class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = middle(head), midPlus1 = mid.next;
        mid.next = null;
        ListNode left = sortList(head), right = sortList(midPlus1), sortedList = merge(left,right);
        return sortedList;
    }
    public ListNode middle(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode newNode = new ListNode(), tail = newNode;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = head1 != null ? head1 : head2;
        return newNode.next;
    }

}