class Solution {
    // Function to find the intersection node of two linked lists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Create a hash set to store the nodes
        // Of the first list
        HashSet<ListNode> nodes_set = new HashSet<>();

        // Traverse the first linked list
        // And add all its nodes to the set
        while (headA != null) {
            nodes_set.add(headA);
            headA = headA.next;
        }

        // Traverse the second linked list
        // And check for intersection
        while (headB != null) {
            // If a node from the second list is found in the set,
            // It means there is an intersection
            if (nodes_set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        // No intersection found, return null
        return null;
    }
}