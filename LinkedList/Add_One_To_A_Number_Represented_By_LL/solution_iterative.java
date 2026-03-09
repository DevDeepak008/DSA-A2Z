class Solution {
    // Function to reverse the linked list
    public ListNode reverseList(ListNode head) {
        // Initialize pointers
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            // Store next node
            next = current.next;
            // Reverse the link
            current.next = prev;
            // Move prev to current
            prev = current;
            // Move current to next
            current = next;
        }
        
        return prev;
    }
    
    // Function to add one to Linked List
    public ListNode addOne(ListNode head) {
        // Reverse the linked list
        head = reverseList(head);
        
        // Create a dummy node
        ListNode current = head;
        // Initialize carry with 1
        int carry = 1;  
        
        while (current != null) {
            /* Sum the current node's value 
            and the carry */
            int sum = current.val + carry;
            // Update carry
            carry = sum / 10;
            // Update the node's value
            current.val = sum % 10;
            
            /* If no carry left
            break the loop */
            if (carry == 0) {
                break;
            }
            
            /* If we've reached the end of the list
            and there's still a carry,
            add a new node with the carry value */
            if (current.next == null && carry != 0) {
                current.next = new ListNode(carry);
                break;
            }
            
            // Move to the next node
            current = current.next;
        }
        
        // Reverse the list 
        head = reverseList(head);
        
        // New head
        return head;
    }
}