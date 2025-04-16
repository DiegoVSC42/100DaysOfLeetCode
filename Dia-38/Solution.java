class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode newHead = head;
        int count = -1;
        while(head != null){
            count++;
            head = head.next;
        }
        int result = 0;
        for(int i = count; i >= 0 ; i--){
            result += newHead.val * Math.pow(2,i);
            newHead = newHead.next;
        }
        return result;
    }
}