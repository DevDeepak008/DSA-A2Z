// Solution class
class Solution {
    /* Function to insert a node before the
    Kth node in a doubly linked list */
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        // If node has to be inserted before the head
        if (K == 1) {
            ListNode newHead = new ListNode(X, null, head);
            head.prev = newHead;
            return newHead;
        }

        // Temporary pointer 
        ListNode temp = head;

        // Reach Kth node
        int count = 0;
        while (temp != null) {
            count++;

            // If Kth node is reached, Break out of the loop
            if (count == K) break;

            // Otherwise Keep moving temp forward
            temp = temp.next;
        }

        // Track the node 
        ListNode prev = temp.prev;

        // Create new node with data as X
        ListNode newNode = new ListNode(X, prev, temp);

        // Join new node 
        prev.next = newNode;
        temp.prev = newNode;

        // Return head 
        return head;
    }
}