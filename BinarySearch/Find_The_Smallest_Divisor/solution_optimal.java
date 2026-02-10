class Solution {
    /* Helper function to find the 
    summation of division values */
    private int sumByD(int[] nums, int limit) {
        // Size of array
        int n = nums.length; 
        
        // Find the summation of division values
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)nums[i] / (double)limit);
        }
        return sum;
    }

    // Function to find the smallest divisor
    public int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        if (n > limit) return -1;
        
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        int low = 1, high = maxi;

        // Apply binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}