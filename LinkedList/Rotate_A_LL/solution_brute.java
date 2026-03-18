class Solution {
    // Function to rotate the list by k steps
    public ListNode rotateRight(ListNode head, int k) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // Perform rotation k times
        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            // Find the second last node
            while (temp.next.next != null) temp = temp.next;
            // Get the last node
            ListNode end = temp.next;
            // Break the link between 
            // second last and last node
            temp.next = null;
            // Make the last node
            // as new head
            end.next = head;
            head = end;
        }
        return head;
    }
}