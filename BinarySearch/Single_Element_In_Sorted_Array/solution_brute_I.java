class Solution {
    /* Function to find the single non
    duplicate element in a sorted array */
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length; // Size of the array.
        
        /* If array has only one element
           return it immediately.*/
        if (n == 1) return nums[0];

        /* Traverse through the array to find 
           the single non-duplicate element.*/
        for (int i = 0; i < n; i++) {
            // Check for the first index.
            if (i == 0) {
                if (nums[i] != nums[i + 1])
                    return nums[i];
            }
            // Check for the last index.
            else if (i == n - 1) {
                if (nums[i] != nums[i - 1])
                    return nums[i];
            }
            // Check for any other index.
            else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                    return nums[i];
            }
        }

        /* Dummy return statement,
           should never reach here.*/
        return -1;
    }
}