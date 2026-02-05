class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int low = 0, high = nums.length - 1;

      // Applying binary search
      while(low <= high) {
        int mid =(low + high) / 2;

        // Check if mid point to the target
        if(nums[mid] == k) return true;

        // Handle duplicates: if arr[low], arr[mid], arr[high] are equal
        if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
            low = low + 1;
            high = high - 1;
            continue;
        }

        // Check if left part is sorted
        if(nums[low] <= nums[mid]) {
            // Eliminate the right part if target exists in the left sorted part
            if(nums[low] <= k && k <= nums[mid]) {
                high = mid - 1;
            } 
            // Otherwise eliminate the left part
            else {
                low = mid + 1;
            }
        }
        // Check if right part is sorted
        else {
            // If the right part is sorted and the target exists in the right sorted part, eliminate the left part
            if(nums[mid] <= k && k <= nums[high]) {
                low = mid + 1;
            } 
            // Otherwise eliminate the right part
            else {
                high = mid - 1;
            }
        }
      }
      // If target is not found
      return false;
    }
}