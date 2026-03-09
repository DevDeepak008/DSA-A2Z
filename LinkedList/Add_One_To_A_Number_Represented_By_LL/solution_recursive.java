class Solution {
    // Helper function to add one to the linked list
    private int addHelper(ListNode temp) {
        /* If the list is empty
        return a carry of 1 */
        if (temp == null) 
            return 1;
        
        /* Recursively call addHelper 
        For the next node */
        int carry = addHelper(temp.next); 
        
        /* Add the carry 
        to the current node's value */
        temp.val += carry; 
        
        /* If the current node's value 
        is less than 10
        no further carry is needed */
        if (temp.val < 10) 
            return 0;
        
        /* If the current node's value is 10 or more
        set it to 0 and return a carry of 1 */
        temp.val = 0; 
        return 1;
    }

    public ListNode addOne(ListNode head) {
        /* Call the helper function 
        to start the addition process */
        int carry = addHelper(head);
        
        /* If there is a carry left 
        after processing all nodes
        add a new node at the head */
        if (carry == 1) { 
            ListNode newNode = new ListNode(1);
            /* Link the new node to the current head */
            newNode.next = head; 
            /* Update the head to the new node */
            head = newNode; 
        }
        // Return the head 
        return head; 
    }
}