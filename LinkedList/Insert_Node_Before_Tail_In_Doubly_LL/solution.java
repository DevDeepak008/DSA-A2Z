// Solution class
class Solution {
    // Function to insert a node before tail of a doubly linked list
    public ListNode insertBeforeTail(ListNode head, int X) {
        // Edge case
        if (head.next == null) {
            // Create new node with data as X
            ListNode newHead = new ListNode(X, null, head);
            head.prev = newHead;
            return newHead;
        }

        // Create pointer tail
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Keep track of node before tail using prev
        ListNode prev = tail.prev;

        // Create new node with value X
        ListNode newNode = new ListNode(X, prev, tail);

        // Join the new node
        prev.next = newNode;
        tail.prev = newNode;

        // Return updated linked list
        return head;
    }
}