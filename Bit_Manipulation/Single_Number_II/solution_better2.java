class Solution {
    /* Function to get the single 
    number in the given array */
    public int singleNumber(int[] nums) {
        // Variable to store size of array
        int n = nums.length;
        
        // Sorting the array
        Arrays.sort(nums);
        
        // Traversing the array
        for (int i = 1; i < nums.length; i += 3) {
            /* Checking the elements 
            in the bucket */
            if (nums[i] != nums[i - 1]) {
                // Return the single number
                return nums[i - 1];
            }
        }
        
        /* If not found till now, then 
        the last number will be single */
        return nums[n - 1];
    }
}