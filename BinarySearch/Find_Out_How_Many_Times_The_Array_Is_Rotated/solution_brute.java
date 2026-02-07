class Solution {
    /* Function to find the number of
       rotations in a rotated sorted array */
    public int findKRotation(ArrayList<Integer> nums) {
        // Get the size of the array
        int n = nums.size();
        
        /* Initialize variables to store
           minimum value and its index */
        int ans = Integer.MAX_VALUE, index = -1;
        
        /* Iterate through the array to
           find the smallest element */
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < ans) {
                ans = nums.get(i);  // Update minimum value
                index = i;          // Update index of minimum value
            }
        }
        // Return the index of smallest element
        return index;
    }
}