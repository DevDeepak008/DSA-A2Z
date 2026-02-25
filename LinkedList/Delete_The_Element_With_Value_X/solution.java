// Solution class
class Solution {
    // To delete a node with a specific value in a linked list
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        // Check if list is empty
        if (head == null)
            return head;

        // If first node has target value, delete
        if (head.data == X) {
            head = head.next;
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        /* Traverse the list to find 
        the node with the target value */
        while (temp != null) {
            if (temp.data == X) {
                // Adjust the pointers
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}