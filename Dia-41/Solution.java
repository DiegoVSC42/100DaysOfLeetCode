class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int size = 1;
        ListNode lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            size++;
        }
        k = k % size;
        if (k == 0) return head;
        ListNode newNode = head;
        for(int i = 1 ; i < size - k ;i++){
            newNode = newNode.next;
        }
        ListNode newHead = newNode.next;
        newNode.next = null;
        lastNode.next = head;
        return newHead;
    }
}