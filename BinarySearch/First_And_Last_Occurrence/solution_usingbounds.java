class Solution {
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length; 

        // Applying binary search algorithm
        while(low <= high) {
            int mid = (low + high) / 2;

            /*  If the middle element is greater than
                or equal to the target element update 
                the answer as mid and eliminate the right half  */
            if(nums[mid] >= target) {
                ans = mid;  
                high = mid - 1;  
            }

            /*  If the middle element is smaller than
                the target element then we eliminate 
                the left half  */ 
            else {
                low = mid + 1; 
            }
        }
        return ans;
    }

    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;  

        // Applying binary search algorithm
        while(low <= high) {
            int mid = (low + high) / 2;

            /*  If the middle element is greater than
                the target element update the answer 
                as mid and eliminate the right half  */
            if(nums[mid] > target) {
                ans = mid;  
                high = mid - 1;  
            } 
            /*  If the middle element is greater than
                or equal to the target element 
                eliminate the right half  */ 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        // Function call to find the first occurrence (lower bound)
        int firstOcc = lowerBound(nums, target);  

        // Check if the target is present in the array or not
        if(firstOcc == nums.length || nums[firstOcc] != target) return new int[]{-1, -1}; 

        // Function call to find the last occurrence (upper bound)
        int lastOcc = upperBound(nums, target) - 1;  
        
        return new int[]{firstOcc, lastOcc};  
    }
}