class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int n1 = 0, n2 = 0;

        // Get the length of first linked list
        while (temp1 != null) {
            n1++;
            temp1 = temp1.next;
        }

        // Get the length of second linked list
        while (temp2 != null) {
            n2++;
            temp2 = temp2.next;
        }

        // Traverse the longer list and bring the pointers to same level
        if (n1 < n2) return collisionPoint(headA, headB, n2 - n1);

        return collisionPoint(headB, headA, n1 - n2);
    }

    private ListNode collisionPoint(ListNode smallerListHead, ListNode longerListHead, int len) {
        ListNode temp1 = smallerListHead;
        ListNode temp2 = longerListHead;

        // Adjust the pointers to same level
        for (int i = 0; i < len; i++) temp2 = temp2.next;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
}