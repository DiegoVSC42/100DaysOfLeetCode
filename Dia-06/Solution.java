//Reverse Linked List
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

//Middle of the Linked List

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

//Merge Two Sorted Lists

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode current = mergedList;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }
        return mergedList.next;
    }
}