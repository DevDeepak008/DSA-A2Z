class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;

       /// Find the maximum element in nums
       int maxi = Integer.MIN_VALUE;
       for(int i = 0; i < n; i++) {
        maxi = Math.max(maxi, nums[i]);
       }

       // Find the smallest divisor
       for(int d = 1; d <= maxi; d++) {
        int sum = 0;

        // Calculate the sum of ceil(nums[i] / d) for all elements
        for(int i = 0; i < n; i++) {
            sum += Math.ceil((double) nums[i] / (double)(d));
        }

        // Check if the sum is <= limit
        if(sum <= limit) {
            return d;
        }
       }
       // Return -1 if no valid divisor found
       return -1;
    }
}