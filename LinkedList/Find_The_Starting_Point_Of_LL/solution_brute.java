
class Solution {
    public ListNode findStartingPoint(ListNode head) {
        // Use temp to traverse the linked list
        ListNode temp = head;
        
        // HashMap to store all visited nodes
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        // Traverse the list using temp
        while (temp != null) {
            // Check if temp has been encountered again
            if (map.containsKey(temp)) {
                // A loop is detected hence return temp
                return temp;
            }
            // Store temp as visited
            map.put(temp, 1);
            // Move to the next node
            temp = temp.next;
        }

        // If no loop is detected, return null
        return null;
    }
}
