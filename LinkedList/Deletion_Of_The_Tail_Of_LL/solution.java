class Solution {
    // Function to delete the tail node of linked list
    public ListNode deleteTail(ListNode head) {

        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return null; // Return null
        }

        // Temporary pointer
        ListNode temp = head;

        /* Traverse to the second last 
        node in the list */
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete the last node
        temp.next = null;

        // Return head of modified list
        return head;
    }
}