class Solution {
    // Function to search for the target element in a rotated sorted array
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int n = nums.length; 
        
        // Traverse the array to find the target element
        for (int i = 0; i < n; i++) {
            // If the current element matches the target, return true
            if (nums[i] == k) return true;
        }
        // If the target is not found, return false
        return false;
    }
}