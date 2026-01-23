class Solution {
    // Function to find maximum product subarray
    public int maxProduct(int[] nums) {
        // Initialize result with first element of nums
        int result = nums[0];

        /* Iterate through each element
        as a starting point of subarray */
        for (int i = 0; i < nums.length; i++) {
            // Initialize p with nums[i]
            int p = nums[i];

            /* Iterate through subsequent elements
            to form subarrays starting from nums[i] */
            for (int j = i + 1; j < nums.length; j++) {
                
                /* Update result with the
                max of current result and p */
                result = Math.max(result, p);

                // Update p by multiplying with nums[j]
                p *= nums[j];
            }

            // Update result for subarray ending at nums[i]
            result = Math.max(result, p);
        }

        // Return maximum product subarray found
        return result;
    }
}