class Solution {
    // Function to clone linked list with random pointers
    public ListNode copyRandomList(ListNode head) {
        // If the head is null, return null
        if (head == null) return null;

        /*Create a HashMap to map 
        original nodes to their corresponding copied nodes*/
        HashMap<ListNode, ListNode> map = new HashMap<>();
        ListNode temp = head;

        // Create copies of each node
        while (temp != null) {
            // Create new node with same value as original
            ListNode newNode = new ListNode(temp.val);
            // Map to original node 
            map.put(temp, newNode);
            // Move to next node
            temp = temp.next;
        }

        // Reset temp 
        temp = head;

        /*Connect the next and 
        random pointers of the 
        copied nodes using the map*/
        while (temp != null) {
            // Get copied node from the map
            ListNode copyNode = map.get(temp);
            /*Set next pointer of copied node 
            to the copied node of the next 
            original node*/
            copyNode.next = map.get(temp.next);
            /*Set the random pointer of the 
            copied node to the copied node of 
            the random original node*/
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }

        // Return the head
        return map.get(head);
    }
}