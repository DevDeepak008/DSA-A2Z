class Solution {
    // Function to segregate odd and even indices nodes
    public ListNode oddEvenList(ListNode head) {
        // Check if list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // To store values
        List<Integer> array = new ArrayList<>();   
        ListNode temp = head;

        /*Traverse the list, skipping one node, 
        and store values in the vector*/
        while (temp != null && temp.next != null) {
            array.add(temp.data);
            temp = temp.next.next;
        }

        /* If the traversal ends on a valid 
        odd-indexed node, include its value as well*/
        if (temp != null)
            array.add(temp.data);

        // Reset temp 
        temp = head.next;

        /*Traverse the list again, skipping one node,
         and store values 
        in the vector*/
        while (temp != null && temp.next != null) {
            array.add(temp.data);
            temp = temp.next.next;
        }

       /* If the traversal ends on a valid 
        even-indexed node, include its value as well */
        if (temp != null)
            array.add(temp.data);

        // Reset temp 
        temp = head;
        int i = 0;

        // Update node values 
        while (temp != null) {
            temp.data = array.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}