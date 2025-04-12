public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode aux1 = head;
        ListNode aux2 = head;
        while(aux1 != null && aux1.next != null){
            aux2 = aux2.next;
            aux1 = aux1.next.next;
            if(aux1 == aux2){
                return true;
            }
        }
        return false;
    }
}