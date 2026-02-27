// Solution class
class Solution {
    // Function to insert a new node at the kth position 
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        /* If the linked list is empty 
        and k is 1, insert the 
        new node as the head */
        if (head == null) {
            if (K == 1)
                return new ListNode(X);
            else
                return head;
        }

        /* If K is 1, insert the new
        node at the beginning 
        of the linked list */
        if (K == 1)
            return new ListNode(X, head);

        int cnt = 0;
        ListNode temp = head;

        /* Traverse the linked list 
        to find the node at position k-1 */
        while (temp != null) {
            cnt++;
            if (cnt == K - 1) {
                /* Insert the new node after the node 
                at position k-1 */
                ListNode newNode = new ListNode(X, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}