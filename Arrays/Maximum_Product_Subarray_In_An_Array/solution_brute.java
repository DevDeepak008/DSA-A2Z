class Solution {
    // Function to find maximum product subarray
    public int maxProduct(int[] nums) {
        // Initialize result to minimum possible integer
        int result = Integer.MIN_VALUE;

        // Iterate through all subarrays
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int prod = 1;

                // Calculate product of subarray 
                for (int k = i; k <= j; k++) {
                    prod *= nums[k];
                }

                // Update the result with maximum product found
                result = Math.max(result, prod);
            }
        }

        // Return the maximum product found
        return result;
    }
}