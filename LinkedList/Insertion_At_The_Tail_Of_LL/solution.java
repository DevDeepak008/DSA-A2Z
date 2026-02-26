// Solution class
class Solution {
    // Function to insert a new node at the tail of the linked list
    public ListNode insertAtTail(ListNode head, int X) {
        if (head == null)
            return new ListNode(X);

        ListNode temp = head;
        // Traversing until the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode newNode = new ListNode(X);
        temp.next = newNode;

        return head;
    }
}