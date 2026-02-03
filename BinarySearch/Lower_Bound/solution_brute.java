class Solution {
    // Function to find the lower bound
    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            /* Check the condition for 
               the current element */
            if (nums[i] >= x) {
                // If lower bound is found
                return i;
            }
        }
        /* If lower bound of 
           target is not found */
        return n;
    }
}