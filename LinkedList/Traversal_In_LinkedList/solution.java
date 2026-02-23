/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public List<Integer> LLTraversal(ListNode head) {
        // Storing a copy of the linked list
        ListNode temp = head;
        // To store the values sequentially
        List<Integer> ans = new ArrayList<>();

        // Keep traversing until null is encountered
        while(temp != null) {
            // Storing the values
            ans.add(temp.data);
            // Storing the address of the next node
            temp = temp.next;
        }
        return ans;
    }
}