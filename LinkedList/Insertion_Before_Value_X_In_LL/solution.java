class Solution {
    // Function to insert a new node before the given node
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) {
            return null;
        }

        /* Insert at the beginning if the
        value matches the head's data */
        if (head.data == X)
            return new ListNode(val, head);

        ListNode temp = head;
        while (temp.next != null) {
            /* Insert at the current position if 
            the next node has the desired value */
            if (temp.next.data == X) {
                ListNode newNode = new ListNode(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}