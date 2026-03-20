class Solution {
    // Function to convert a vector to a linked list
    private ListNode convertArrToLinkedList(List<Integer> arr) {
        /* Create a dummy node to serve as
         the head of the linked list */
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        /* Iterate through the vector and
         create nodes with vector elements */
        for (int i = 0; i < arr.size(); i++) {
            // Create a new node with the vector element
            temp.child = new ListNode(arr.get(i));
            
            // Update the temporary pointer
            temp = temp.child;
        }
        
        /* Return the linked list starting
         from the next of the dummy node */
        return dummyNode.child;
    }

    // Function to flatten a linked list with child pointers 
    public ListNode flattenLinkedList(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        // Traverse through the linked list
        while (head != null) {
            /* Traverse through the child
             nodes of each head node */
            ListNode t2 = head;
            
            while (t2 != null) {
                // Store each node's data in the array
                arr.add(t2.val);
                
                // Move to the next child node
                t2 = t2.child;
            }
            // Move to the next head node
            head = head.next;
        }

        // Sort the array containing node values
        Collections.sort(arr);

        // Convert the sorted array back to a linked list
        return convertArrToLinkedList(arr);
    }
}