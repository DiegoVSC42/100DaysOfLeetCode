 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 1, lengthB = 1;
        ListNode a = headA, b = headB;
        while (a.next != null || b.next != null) {
            if (a.next != null) {
                lengthA++;
                a = a.next;
            }
            if (b.next != null) {
                lengthB++;
                b = b.next;
            }
        }
        if (a != b) return null;
        int diff = Math.abs(lengthA - lengthB);
        for (int i = 0; i < diff; i++) {
            if (lengthA > lengthB) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }