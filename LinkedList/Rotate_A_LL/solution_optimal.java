class Solution {
    // Function to rotate the list by k steps
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) 
            return head;

        // Calculating length
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }

        // Link last node to first node
        temp.next = head;
        // When k is more than length of list
        k = k % length; 
        // To get end of the list
        int end = length - k; 
        while (end-- > 0) 
            temp = temp.next;

        // Breaking last node link and pointing to NULL
        head = temp.next;
        temp.next = null;

        return head;
    }
}