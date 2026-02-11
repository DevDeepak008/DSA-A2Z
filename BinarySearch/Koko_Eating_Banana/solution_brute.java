class Solution {
    // Helper function to find the maximum element in the array
    private int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        int n = v.length;

        // Find the maximum element
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    /* Helper function to calculate total hours
       required at given hourly rate */
    private long calculateTotalHours(int[] v, int hourly) {
        long totalH = 0;
        int n = v.length;

        // Calculate total hours required
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) v[i] / (double) hourly);
        }
        return totalH;
    }

    // Function to find the minimum rate to eat bananas
    public int minimumRateToEatBananas(int[] nums, int h) {
        // Find the maximum number of bananas
        int maxi = findMax(nums);

        /* Find the minimum value of k
           that satisfies the condition */
        for (int i = 1; i <= maxi; i++) {
            long reqTime = calculateTotalHours(nums, i);
            if (reqTime <= (long) h) {
                return i;
            }
        }

        /* Dummy return statement (should 
           not be reached in valid cases) */
        return maxi;
    }
}