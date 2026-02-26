// Solution class
class Solution {
    // Function to insert at head
    public ListNode insertAtHead(ListNode head, int X) {
        // Creating a new node 
        ListNode newnode = new ListNode(X);
        
        /* Making next of newly created node to 
        point to the head of the LinkedList */
        newnode.next = head;
        
        // Making newly created node as head
        head = newnode;
        
        // Return the head of modified list
        return head;
    }
}