class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        
        int ans = Integer.MIN_VALUE; // to store the answer
        
        // Indices to store the prefix and suffix multiplication
        int prefix = 1, suffix = 1;
        
        // Iterate on the elements of the given array
        for (int i = 0; i < n; i++) {
            
            /* Resetting the prefix and suffix
            multiplication if they turn out to be zero */
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            
            // update the prefix and suffix multiplication
            prefix *= nums[i];
            suffix *= nums[n - i - 1];
            
            // store the maximum as the answer
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        
        // return the result
        return ans;
    }
}