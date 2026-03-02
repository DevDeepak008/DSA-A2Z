// Solution class
class Solution {
    /* Function to insert a node before 
    head in a doubly linked list */
    public ListNode insertBeforeHead(ListNode head, int X) {
        // Create new node which will be the new head
        ListNode newHead = new ListNode(X, null, head);

        // Point the current head back to new one
        head.prev = newHead;

        return newHead; // Return new head
    }
}