class Solution {

    /* Function to reverse a linked list
       using the iterative approach */
    private ListNode reverseLinkedList(ListNode head) {
        // Initialize previous pointer as null
        ListNode prev = null;

        // Initialize current pointer as head
        ListNode curr = head;

        // Traverse the list until all nodes are processed
        while (curr != null) {

            // Temporarily store the next node
            ListNode nextNode = curr.next;

            // Reverse the link direction
            curr.next = prev;

            // Move 'prev' one step forward
            prev = curr;

            // Move 'curr' one step forward
            curr = nextNode;
        }

        // 'prev' now points to the new head after reversal
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        /* Check if the linked list is empty
           or has only one node */
        if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }

        /* Initialize two pointers, slow and fast,
           to find the middle of the linked list */
        ListNode slow = head;
        ListNode fast = head;

        /* Traverse the linked list to find the
           middle using the slow-fast pointer approach */
        while (fast.next != null && fast.next.next != null) {

            // Move slow pointer one step
            slow = slow.next;

            // Move fast pointer two steps
            fast = fast.next.next;
        }

        /* Reverse the second half of the linked list
           starting from the node after the middle */
        ListNode newHead = reverseLinkedList(slow.next);

        // Pointer to the first half
        ListNode first = head;

        // Pointer to the reversed second half
        ListNode second = newHead;

        /* Compare nodes from both halves
           one by one to check for palindrome */
        while (second != null) {

            // If mismatch found, it's not a palindrome
            if (first.val != second.val) {

                // Restore the original list before returning
                reverseLinkedList(newHead);

                return false;
            }

            // Move both pointers one step ahead
            first = first.next;
            second = second.next;
        }

        /* Restore the second half of the linked list
           to its original order */
        reverseLinkedList(newHead);

        // All values matched, the list is a palindrome
        return true;
    }
}
