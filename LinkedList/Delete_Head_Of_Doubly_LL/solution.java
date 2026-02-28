class Solution {
    // Function to delete the head of the doubly linked list
    public ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null)
            return null; // Return null if the list is empty or has one node
        
        // Store current head as 'prev'
        ListNode prev = head;
        // Move 'head' to next node
        head = head.next;

        // Set 'prev' pointer
        head.prev = null;

        // Set 'next' pointer
        prev.next = null;

        // Return new head
        return head;
    }
}