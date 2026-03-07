class Solution {
    // Function to remove the nth node from end
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int cnt = 0;
        ListNode temp = head;

        // Count the number of nodes
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        /* If N equals 
        the total number of nodes
        delete the head */
        if (cnt == n) {
            ListNode newHead = head.next;
            return newHead;
        }

        /* Calculate the position 
        of the node to delete (res) */
        int res = cnt - n;
        temp = head;

        /* Traverse to the node 
        just before the one to delete */
        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        // Delete the Nth node from the end
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}