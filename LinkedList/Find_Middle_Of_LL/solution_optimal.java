class Solution {
    // Function to get the middle node of linked list
    public ListNode middleOfLinkedList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Until the fast pointer reaches NULL or the last node
        while (fast != null && fast.next != null) {
            // Move slow pointer by one step
            slow = slow.next;
            
            // Move fast pointer by two steps
            fast = fast.next.next;
        }
        
        return slow;
    }
}