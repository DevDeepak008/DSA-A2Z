class Solution {
    public int search(int[] nums, int target) {
        //Size of array
        int n = nums.length;

        //Pointers to define the search space
        int low = 0, high = n - 1;

        //Until the search space is not empty
        while(low <= high) {
            //Finfd the middle element
            int mid = (low + high) / 2;

            //If it matches the target
            if(nums[mid] == target) return mid;

            //If the target is greater than middle element
            else if(target > nums[mid]) low = mid + 1;

            //Otherwise
            else high = mid - 1;
        }

        //If the target is not found
        return -1;
    }
}