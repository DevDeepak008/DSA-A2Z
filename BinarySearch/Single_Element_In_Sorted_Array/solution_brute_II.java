class Solution {
    /* Function to find the single non
       duplicate element in a sorted array */
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length; // Size of the array.
        
        /* XOR all the elements to find 
           the single non-duplicate element. */
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= nums[i];
        }
        
        /* Return the single non 
           duplicate element found. */
        return ans;
    }
}