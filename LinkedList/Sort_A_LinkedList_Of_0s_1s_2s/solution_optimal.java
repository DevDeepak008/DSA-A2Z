class Solution {
    // Function to sort the linked list
    public ListNode sortList(ListNode head) {
        /* If the list is empty or has only one 
           node, return as it is already sorted */
        if (head == null || head.next == null)
            return head;

        // Dummy nodes to point to heads of 
        // three lists
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        // Pointers to current last nodes of 
        // three lists
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;

        /* Traverse the original list 
           and distribute the nodes 
           into three lists */
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else if (temp.data == 2) {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        // Connect the three lists together
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        // New head of the sorted list
        ListNode newHead = zeroHead.next;

        // Delete dummy nodes
        return newHead;
    }
}