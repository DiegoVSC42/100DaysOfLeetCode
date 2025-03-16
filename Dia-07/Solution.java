class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode current = resultNode;
        int resultNumber;
        int aux = 0;
        while(l1 != null || l2 != null || aux != 0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            resultNumber = v1 + v2 + aux;
            if(resultNumber > 9){
                resultNumber = resultNumber % 10;
                aux = 1;
            }else{
                aux = 0;
            }
            current.next = new ListNode(resultNumber);
            current = current.next;
            if (l1 != null) l1 = l1.next; 
            if (l2 != null) l2 = l2.next;
        }
        return resultNode.next;
    }
}