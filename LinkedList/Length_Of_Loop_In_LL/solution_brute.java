
class Solution {
    // Function to find length
    public int findLengthOfLoop(ListNode head) {
        // HashMap to store visited nodes and their timer values
        HashMap<ListNode, Integer> visitedNodes = new HashMap<>();

        // Initialize pointer to traverse the linked list
        ListNode temp = head;

        // Initialize timer 
        // to track visited nodes
        int timer = 0;

        // Traverse the linked list 
        // till temp reaches null
        while (temp != null) {
            // If revisiting a node return difference of timer values
            if (visitedNodes.containsKey(temp)) {
                // Calculate the length of the loop
                int loopLength = timer - visitedNodes.get(temp);

                // Return length of loop
                return loopLength;
            }
            /* Store the current node 
            and its timer value in 
            the HashMap */
            visitedNodes.put(temp, timer);

            // Move to the next node
            temp = temp.next;

            // Increment the timer
            timer++;
        }

        /** If traversal is completed 
         * and we reach the end 
         * of the list (null)
         * means there is no loop */
        return 0;
    }
}
