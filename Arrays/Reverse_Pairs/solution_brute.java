class Solution {
    /* Function to count reverse
    pairs where a[i] > 2 * a[j]*/
    public int reversePairs(int[] nums) {
        
        // Call countPairs with the array and its length
        return countPairs(nums, nums.length); 
        
    }

    /* Helper function to count pairs
    satisfying the condition a[i] > 2 * a[j]*/
    private int countPairs(int[] nums, int n) {
        
        // Initialize count of reverse pairs
        int cnt = 0;
        
        /* Nested loops to check each
        pair (i, j) where i < j*/
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                /* Check if the condition 
                a[i] > 2 * a[j] holds*/
                if ((long)nums[i] > (long)2 * nums[j]) {
                    
                    /* Increment count if
                    condition is satisfied*/
                    cnt++; 
                    
                }
            }
        }
        // Return the total count of reverse pairs
        return cnt; 
    }
}