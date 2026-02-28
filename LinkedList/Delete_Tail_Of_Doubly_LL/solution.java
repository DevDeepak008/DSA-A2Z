class Solution {
    // Function to delete the tail of a doubly linked list
    public ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;  
        }
        
        // Navigate to the tail of the linked list
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        // Update the pointers
        ListNode newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        
        // Return head of modified list
        return head;
    }
}